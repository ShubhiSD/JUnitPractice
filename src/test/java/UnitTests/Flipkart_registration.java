package UnitTests;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_registration {
	
	 @Test
	  public void Test3() {
		System.out.println("3");
		 WebDriverWait wait = new WebDriverWait(TestRunner.driver, 10); 
		  WebElement loginBttn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()= 'Login & Signup']")));
			  loginBttn.click();
		  //resgisterUser
		  //find any string contain SignUp and then find parent node of the string which is link to registration page
		  WebElement signUpBttn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Sign up')]/parent::a")));	
		  signUpBttn.click();
		  Assert.assertTrue((TestRunner.driver.findElement(By.xpath("//*[contains(text(),'not share your personal')]"))).isDisplayed());
		}
	@Test
	  public void Test4() {
		System.out.println("4");
		//registerUserAlreadyExist
		  WebElement usernamElement = TestRunner.driver.findElement(By.cssSelector("._2zrpKA"));
		  usernamElement.sendKeys("9004676496");
		  WebElement continueBttn = TestRunner.driver.findElement(By.xpath("//*[text()='CONTINUE']/parent::button"));		
		  continueBttn.click();
		  Assert.assertTrue((TestRunner.driver.findElement(By.xpath("//*[contains(text(),'You are already registered')]"))).isDisplayed());
	  }
	@Test
	public void Test5() {
		System.out.println("5");
		//registerNewUser
		  WebElement usernamElement = TestRunner.driver.findElement(By.cssSelector("._2zrpKA"));
		  usernamElement.clear();
		  usernamElement.sendKeys("9004676400");
		  WebElement continueBttn = TestRunner.driver.findElement(By.xpath("//*[text()='CONTINUE']/parent::button"));		
		  continueBttn.click();
		  Assert.assertTrue((TestRunner.driver.findElement(By.xpath("//*[contains(text(),'OTP sent to Mobile')]"))).isDisplayed());
		
		  closeRegistrationWindow();
	}

	public void closeRegistrationWindow() {
		//switch to login window 
		Set <String> handles = TestRunner.driver.getWindowHandles();
		String  WindowHandlerID = handles.iterator().next();
		TestRunner.driver.switchTo().window(WindowHandlerID);
		//click on close button after switching to login window
		 WebElement closeBttn=TestRunner.driver.findElement(By.cssSelector("button._2AkmmA._29YdH8"));
		closeBttn.click();
	}
}
