/*This test case is to validate whether we are able to login
to the guru99 account*/

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) {
	    WebDriver driver = new ChromeDriver();

	    driver.get("http://live.guru99.com/");
	    driver.manage().window().maximize();
	    
	    //login to the account
	    driver.findElement(By.xpath("//div[@class='footer']//a[contains(text(),'My Account')]")).click();
	    
	    //entering credentials
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pabhishekraj@gmail.com");
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Anurag@41289");
	    driver.findElement(By.xpath("//button[@id='send2']")).click();
	    
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    String actual_name= driver.findElement(By.xpath("//h1[contains(text(),'My Dashboard')] ")).getText();
	    //System.out.println(actual_name);
		
		  if(actual_name.contains("MY DASHBOARD"))
		  
		  { System.out.println("Test Pass"); } else
		  
		  { System.out.println("Text Failed"); }
		 

	    driver.close();

}
}
