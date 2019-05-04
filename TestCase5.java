/*This test case is to validate whether we are able to place orders
in the guru99 account*/

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class TestCase5 {

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
		    
		    //place mobile order to cart 
		    driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
		    driver.findElement(By.xpath("//li[2]//div[1]//div[3]//button[1]//span[1]//span[1]")).click();	    
		    //driver.findElement(By.xpath("//input[@name='cart[100104]'")).sendKeys("10");
		    
		    //update order
		    //driver.findElement(By.xpath("//td[@class='product-cart-actions']//button[@name='update_cart_action']//span//span[contains(text(),'Update')]")).click();
		    driver.findElement(By.xpath("//li[@class='method-checkout-cart-methods-onepage-bottom']//button[@class='button btn-proceed-checkout btn-checkout']//span//span[contains(text(),'Proceed to Checkout')]")).click();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		 //checkout
		    driver.findElement(By.xpath("//div[@id='billing-buttons-container']//button[@class='button']//span//span[contains(text(),'Continue')]")).click();	
		 /* driver.findElement(By.id("billing:firstname")).sendKeys("Abhishek");
		 * driver.findElement(By.id("billing:lastname")).sendKeys("Raj");
		 * driver.findElement(By.id("billing:street1")).sendKeys("White House");
		 * driver.findElement(By.name("billing[city]")).sendKeys("Washington DC");
		 * 
		 * //Selecting state from dropdown Select s = new
		 * Select(driver.findElement(By.id("billing:region_id")));
		 * s.selectByValue("16");
		 * 
		 * driver.findElement(By.id("billing:postcode")).sendKeys("Washington DC");
		 * driver.findElement(By.xpath(
		 * "//div[@id='billing-buttons-container']//button[@class='button']//span//span[contains(text(),'Continue')]"
		 * )).click();
		 */
		    
		    
			//Shipping method
			driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//button[@class='button']//span//span[contains(text(),'Continue')]")).click();
			
			//payment information
			List<WebElement> oRadioButton = driver.findElements(By.name("payment[method]"));
			 
			 oRadioButton.get(1).click();
			 driver.findElement(By.xpath("//div[@id='payment-buttons-container']//button[@class='button']")).click(); 
			 
			//order review
			 driver.findElement(By.xpath("//span[contains(text(),'Place Order')]")).click();
		
			 
		    
		    //test validation
		    String actual_name= driver.findElement(By.xpath("//h1[contains(text(),'Your order has been received.')] ")).getText();
		    System.out.println(actual_name);
		    if(actual_name.contains("YOUR ORDER HAS BEEN RECEIVED."))
				  
			  { System.out.println("Test Pass"); } else
			  
			  { System.out.println("Text Failed"); }
			 
				  
				driver.close();
	}

}
