package TestngBasics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameteraizationInTestNG {
	
	@Test
	@Parameters({"userName","password"})
	public void method1 (String uName, String pswd) {
		System.out.println("UserName Is: "+uName);
		System.out.println("Password Is: "+pswd);
		System.out.println("parameteraizationInTestNGMethod1");
	}
	
	@Test
	public void method2 () {
		System.out.println("parameteraizationInTestNGMethod2");
	}
	
	@Test
	public void method3 () {
		System.out.println("parameteraizationInTestNGMethod3");
	}
	
	

}
