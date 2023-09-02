package TestngBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnInTestNG {

	
	@Test (dependsOnMethods = {"method2"})
	public void method1 () {
		System.out.println("DependsinInTestNGMethod1");
	}
	
	@Test
	public void method2 () {
		Assert.assertEquals("20", "21");
		System.out.println("DependsinInTestNGMethod2");
	}
	
	@Test
	public void method3 () {
		System.out.println("DependsinInTestNGMethod3");
	}
	
	
}
