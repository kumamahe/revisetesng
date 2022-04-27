package Runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class runhelper {
	
	public static void main(String[] args) {
		
		TestNG testng=new TestNG();
		List<XmlSuite> suites=new ArrayList<XmlSuite>();
		XmlSuite suite=new XmlSuite();
		suite.setName("Suite");
		
		List<XmlTest> tests=new ArrayList<XmlTest>();
		XmlTest Test1=new XmlTest(suite, 0);
		Test1.setName("Test1");
		Map<String, String> params=new HashMap<String, String>();
		params.put("browser", "chrome");
		Test1.setParameters(params);
		List<XmlClass> classes=new ArrayList<XmlClass>();
		XmlClass classa=new XmlClass();
		classa.setName("Happy.testngrevise");
		XmlClass classb=new XmlClass();
		classb.setName("Happy."
				+ "testngd");
		classes.add(0,classa);
		classes.add(1,classb);
		Test1.setClasses(classes);
		
		XmlTest Test2=new XmlTest(suite,1);
		Test2.setName("Test2");
		List<XmlClass> classes2=new ArrayList<XmlClass>();
		XmlClass classc=new XmlClass();
		classes2.add(classc);
		classc.setName("Happy.Testngyr");
		Test2.setClasses(classes2);
		
		
		tests.add(0,Test1);
		tests.add(1, Test2);
		
	    suites.add(0, suite);
	    testng.setXmlSuites(suites);
	    testng.run();
		
		
	}

}
