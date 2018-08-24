package UnitTests;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.config.Order;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Flipkart_login {
	
  @Test
 
  public  void Test1() {
	//This method will execute before test and ensure if login window is not open then it opens it
	//if login window not displayed by class for username field
	  if(!(TestRunner.driver.findElement(By.cssSelector("._2zrpKA")).isDisplayed()))
		{
		  if(TestRunner.driver.findElement(By.xpath("//div[text()='My Account']")).isDisplayed())
			  logout();//if already logged in then first logout 
		  //launch login screen from main flipkart page
		  WebElement loginBttn=TestRunner.driver.findElement(By.xpath("//a[text()= 'Login & Signup']"));
		  loginBttn.click();
		  
		}
  }

  
  @Test
  public void Test2() {
	  //checkLogin_email
	  WebElement usernamElement = TestRunner.driver.findElement(By.cssSelector("._2zrpKA"));
		//enter the text
		usernamElement.sendKeys("shubhi.shukla.07@gmail.com");	
		WebElement psswd = TestRunner.driver.findElement(By.cssSelector("input[type='password']"));
		//enter the text
		psswd.sendKeys("aashi@143");
		WebElement bttn = TestRunner.driver.findElement(By.xpath("//*[text()='Login']/parent::button"));
		bttn.submit();
	  Assert.assertTrue((TestRunner.driver.findElement(By.xpath("//div[text()='My Account']"))).isDisplayed());
	 logout();
  }
  /*@Test
  public void Test3() {
	  //checkLogin_mobile
	  login("9004676496");
	  Assert.assertTrue((TestRunner.driver.findElement(By.xpath("//div[text()='My Account']"))).isDisplayed());
		 logout();
  }*/
 
	  public void logout() {
		  WebDriverWait wait = new WebDriverWait(TestRunner.driver, 10); 
		  WebElement myAccount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='My Account']")));
		  Actions action = new Actions(TestRunner.driver);
			action.moveToElement(myAccount).build().perform();
		  
		  WebElement logOut = TestRunner.driver.findElement(By.xpath("//div[text()='Logout']"));		
		  logOut.click();

	  }
}
 