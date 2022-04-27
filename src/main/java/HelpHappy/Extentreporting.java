package HelpHappy;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreporting {
	public static ExtentReports report;
	
	public static ExtentReports getreport()
	{
		if(report==null)
		{
		report=new ExtentReports();
		Date d=new Date();
		String path=System.getProperty("user.dir")+"//report//"+d.toString().replace(":", "_");
		File f=new File(path);
		f.mkdirs();
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test");
		reporter.config().setReportName("ReportTest");
		reporter.config().setEncoding("utf-8");
		reporter.config().setTheme(Theme.DARK);
		report.attachReporter(reporter);
		}
		return report;
	}

}
