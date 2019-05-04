
/*This test case is to validate whether we are able to signup
to  guru99 ecomm page */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

	    driver.get("http://live.guru99.com/");
	    driver.manage().window().maximize();
	    int randNum = (int) (Math.random() * 100);
	    
	    //Create a new account
	    driver.findElement(By.xpath("//div[@class='footer']//a[contains(text(),'My Account')]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();
	    
	    //Register new member
	    driver.findElement(By.id("firstname")).sendKeys("Test"+randNum);
	    driver.findElement(By.id("middlename")).sendKeys("Test"+randNum);
	    driver.findElement(By.id("lastname")).sendKeys("Test"+randNum);
	    driver.findElement(By.id("email_address")).sendKeys("Test"+randNum+"@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("Test@123");
	    driver.findElement(By.id("confirmation")).sendKeys("Test@123");
	    
	    driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	    //Testcase validation
	    String actual_name= driver.findElement(By.xpath("//span[contains(text(),'Thank you for registering with Main Website Store.')] ")).getText();
	    //System.out.println(actual_name);
	    
		
		  if(actual_name.contains("Thank you for registering with Main Website Store."))
		  
			  
		  { System.out.println("Test Pass"); } else
		  
		  { System.out.println("Text Failed"); }
		 

	    driver.quit();
	
	}
}
