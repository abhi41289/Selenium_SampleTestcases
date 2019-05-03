
/*This test case is to validate whether we are able to signup
to  facebook */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();

	    //text fields
	    driver.findElement(By.id("u_0_j")).sendKeys("Abhishek");
	    driver.findElement(By.name("lastname")).sendKeys("Raj");
	    driver.findElement(By.name("reg_email__")).sendKeys("9100751649");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Test@41289");

	    //static drop down
	    Select s = new Select(driver.findElement(By.id("day")));
	    Thread.sleep(1000);
	    s.selectByVisibleText("4");

	    Select s1 = new Select(driver.findElement(By.id("month")));
	    Thread.sleep(1000);
	    s1.selectByValue("12");

	    Select s2 = new Select(driver.findElement(By.id("year")));
	    Thread.sleep(1000);
	    s2.selectByValue("1989");
	    //radio button
	    driver.findElement(By.xpath("//input[@value='2']")).click();//for selecting male

	    driver.findElement(By.name("websubmit")).click();

	    //driver.quit();
	}

}
