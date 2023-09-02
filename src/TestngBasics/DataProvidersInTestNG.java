package TestngBasics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersInTestNG {

	@Test (dataProvider = "testData")
	public void method1 (String uName, String pswd, String PSWD) {
		System.out.println("UserName Is: "+uName);
		System.out.println("Password Is: "+pswd);
		System.out.println("Password Is: "+PSWD);
	}
	
	@Test (invocationCount = 10) //It will execute test case for 10 times with same test data
	public void method2 () {
		System.out.println("Test1");
	}
	
	@DataProvider
	public Object [][] testData (){
		
		Object[][] myData = new Object [2][3];
		String str = "Test1";
		
		//Enter data to row 0, Column 0
		myData[0][0] = str;
		//Enter data to row 0, Column 1
		myData[0][1] = "Test11";
		//Enter data to row 0, Column 2
		myData[0][2] = "Test111";
		//Enter data to row 1, Column 0
		myData[1][0] = "Test1111";
		//Enter data to row 1, Column 1
		myData[1][1] = "Test11111";	
		//Enter data to row 1, Column 2
		myData[1][2] = "Test111111";	
	
		return myData;
				
	}
	
	
}
