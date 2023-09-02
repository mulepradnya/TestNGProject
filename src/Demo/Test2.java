package Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	
	
	@Test
	@Parameters({"userName","password"})
	public void method1 (String uName, String pswd) {
		System.out.println("UserName Is: "+uName);
		System.out.println("Password Is: "+pswd);
		System.out.println("Test2Method1");
	}
	
	@Test
	public void method2 () {
		System.out.println("Test2Method2");
	}
	
	@Test (groups = "Smoke Testing")
	public void method3 () {
		System.out.println("Test2Method3");
	}

}
