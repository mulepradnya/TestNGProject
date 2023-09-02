package TestngBasics;

import org.testng.annotations.Test;

public class PrioritiesInTestNG {
	
	//Default priority will be 0
	//Priority will be negative number

	@Test (priority = 11)
	public void method1 () {
		System.out.println("PrioritiesInTestNGMethod1");
	}
	
	@Test (priority = 0)
	public void method2 () {
		System.out.println("PrioritiesInTestNGMethod2");
	}
	
	@Test (priority = -1)
	public void method3 () {
		System.out.println("PrioritiesInTestNGMethod3");
	}	
	
	@Test (priority = 150)
	public void method4 () {
		System.out.println("PrioritiesInTestNGMethod4");
	}
	
	@Test (priority = 0)
	public void method5 () {
		System.out.println("PrioritiesInTestNGMethod5");
	}
	
	@Test (priority = -600)
	public void method6 () {
		System.out.println("PrioritiesInTestNGMethod6");
	}
	
}
