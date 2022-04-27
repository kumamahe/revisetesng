package Happy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import HelpHappy.Extentreporting;

public class testbase {
	public int ant;
	public ExtentTest test;
	public ExtentReports report;
	public WebDriver driver;
	
	@BeforeTest(alwaysRun = true)
	public void beach(ITestContext con) {
		System.out.println("Before test-"+con.getCurrentXmlTest().getName());
		ant=10;
		con.setAttribute("Integer", ant);
		report=Extentreporting.getreport();
		test=report.createTest(con.getCurrentXmlTest().getName());
		test.log(Status.PASS, "Logging test-BeforeTest");
		
		con.setAttribute("report", report);
		con.setAttribute("test", test);
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS.WIN10);
		try {
			driver=new RemoteWebDriver(new URL("http://localhost:4444"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con.setAttribute("driver", driver);
		
	}
	
	@BeforeMethod
	public void set(ITestContext con)
	{
		ant=(Integer) con.getAttribute("Integer");
		test=(ExtentTest)con.getAttribute("test");
		report=(ExtentReports)con.getAttribute("report");
		driver=(WebDriver)con.getAttribute("driver");
		
	}
	
	@AfterTest
	public void quit() {
		report.flush();
		driver.quit();
	}

}
