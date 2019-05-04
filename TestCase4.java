/*This test case is to validate whether we are able to add iphones 
to the guru99 account*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();

		    driver.get("http://live.guru99.com/");
		    driver.manage().window().maximize();
		    
		    //login to the account
		    driver.findElement(By.xpath("//div[@class='footer']//a[contains(text(),'My Account')]")).click();
		    
		    //entering credentials
		    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("pabhishekraj@gmail.com");
		    driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Anurag@41289");
		    driver.findElement(By.xpath("//*[@id='send2']")).click();
		    
		    //add mobile to cart 
		    driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
		    driver.findElement(By.xpath("//*[contains(@onclick,\"product/2\")]")).click();
		    
		    //test validation
		    String actual_name= driver.findElement(By.xpath("//h1[contains(text(),'Shopping Cart')] ")).getText();
		    //System.out.println(actual_name);
			
		
		  if(actual_name.contains("SHOPPING CART"))
		  
		  { System.out.println("Test Pass"); } else
		  
		  { System.out.println("Text Failed"); }
		 
			  
			driver.quit();
		    
	}

}
