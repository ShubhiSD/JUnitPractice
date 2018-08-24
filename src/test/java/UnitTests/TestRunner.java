package UnitTests;
import java.util.concurrent.TimeUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.Log;
public class TestRunner {
	public static  WebDriver driver = null;

	public static void main(String[] args) {
		//This will run JunitMathProvider_1 class.
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		  // Implicit wait
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  //open the url
		  driver.get("http://www.flipkart.com");
		Result result = JUnitCore.runClasses(Flipkart_login.class,Flipkart_registration.class);
	//to run test suit
	//	Result result = JUnitCore.runClasses(TestSuit.class);
		Log.info("Total number of tests " + result.getRunCount());
		Log.info("Total number of tests failed " + result.getFailureCount());

		for(Failure failure : result.getFailures())
		{			
			Log.info(failure.getMessage());
		}		
		Log.info(Boolean.toString(result.wasSuccessful()));
		driver.quit();
	}
}
