package Happy;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Testngyr extends testbase{
	
	@Test
	public void perd()
	{
		System.out.println("Perd");
		test.log(Status.PASS, "Logging report- Perd");
		System.out.println(ant);
		driver.get("https://www.qtpselenium.com/selenium-training");
	}

}
