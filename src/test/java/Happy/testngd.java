package Happy;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class testngd extends testbase{
	
	@Test(groups = "c")
	public void testd()
	{
		System.out.println("TestD");
		test.log(Status.PASS, "Logging report- TestD");
		System.out.println(ant);
		driver.get("https://www.digivante.com/crowdtesting-community/become-a-tester/");
	}

}
