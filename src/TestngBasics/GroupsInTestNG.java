package TestngBasics;

import org.testng.annotations.Test;

public class GroupsInTestNG {

	@Test (groups = {"Smoke Testing", "Regression Testing"})
	public void method1 () {
		System.out.println("GroupsInTestNGMethod1");
	}
	
	@Test (groups = "Regression Testing")
	public void method2 () {
		System.out.println("GroupsInTestNGMethod2");
	}
	
	@Test (groups = "Regression Testing")
	public void method3 () {
		System.out.println("GroupsInTestNGMethod3");
	}
	
	
	
	
}
