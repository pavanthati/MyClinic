package Myclinic.TestComponents;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Myclinic.resources.BaseTest;

public class ITestListerners extends BaseTest implements ITestListener {

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		caputerScreenshot(result.getMethod().getMethodName()+".jpg");
		System.out.print(result.getMethod().getMethodName());
		
	}
	
	
	
	
	

}
