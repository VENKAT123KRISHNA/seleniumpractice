package TestnGG;

import org.testng.IInvokedMethod; 
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class invokemethod implements IInvokedMethodListener {
	

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("excute before invoke method"
				+"-"+method.getTestMethod().getMethodName() );
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("excute after invoke method"
				+"-"+method.getTestMethod().getMethodName() );
		
	}

}
