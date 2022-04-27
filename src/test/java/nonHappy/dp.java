package nonHappy;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import com.google.common.annotations.VisibleForTesting;

import lombok.Data;

public class dp {
	
	@DataProvider
	public Object[][] data(Method m)
	{
		System.out.println("TC name:"+m.getName());
		Object[][] data=new Object[2][2];
		data[0][0]="Kavian";
		data[0][1]=27;
		data[1][0]="Ranjith";
		data[1][1]=30;
		return data;
	}

}
