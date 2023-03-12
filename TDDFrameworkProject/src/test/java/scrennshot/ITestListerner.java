package scrennshot;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListerner extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		captureScreenShot(result.getMethod().getMethodName() + ".jpg");
	}
}
