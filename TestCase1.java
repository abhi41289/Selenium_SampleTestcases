/*This test case is to validate whether or not we are able to navigate 
to the facebook signup and login page*/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCase1 {


		public static void main(String[] args) {
		 
			
			WebDriver driver = new ChromeDriver();
			
			//Goes to the specified URL
			driver.get("http://www.facebook.com");
			System.out.println(driver.getTitle());
			
			String actualTitle=driver.getTitle();
			String expectedTitle="Facebook – log in or sign up";
			
		    
			//Test Case Validation
			if(actualTitle.equals(expectedTitle)){
		        System.out.println("Test Pass");
		    }
		    else{
		        System.out.println("Test Failed");
		    }
		    driver.quit();

		}
}