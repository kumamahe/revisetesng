package Happy;
import nonHappy.dp;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;


public class testngrevise extends testbase{
	
	@Parameters("browser")
	@Test(priority = 1,groups = "a")
	public void testa(String browser) {
		
		System.out.println("TestA");
		test.log(Status.PASS, "Logging report- TestA");
		System.out.println(ant);
		System.out.println(browser);
		Assert.assertTrue(5>2);
		SoftAssert s=new SoftAssert();
		s.fail();
		driver.get("https://app.usertesting.com/users/sign_in");
		
	}
	
	@Test(priority = 2,groups = "b",dependsOnMethods = "testa")
    public void testb()
    {
		System.out.println("TestB");
		test.log(Status.PASS, "Logging report- TestB");
		System.out.println(ant);
		driver.get("https://peter.sh/experiments/chromium-command-line-switches/");
    }
	
	
	@Test(priority = 3,groups = "c",dataProviderClass = dp.class,dataProvider = "data")
	public void testc(String name, int Age)
	{
	    System.out.println("TestC");
	    test.log(Status.PASS, "Logging report- TestC");
		System.out.println("Name"+name);
		System.out.println("Age"+Age);
		System.out.println(ant);
		
	}
	
	
	
}
