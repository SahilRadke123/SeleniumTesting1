package Maven123;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class X_path_2nd_TestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DHEERAJ\\eclipse-workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.saucedemo.com");
		
		driver.findElement(By.xpath("*//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("*//*[@placeholder='Password'][@type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("*//input[@id='login-button']")).click();
		
		String CurrentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(CurrentWindowHandle);
		
		driver.findElement(By.xpath("*//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("*//*[@id='add-to-cart-sauce-labs-bike-light' or @name='add-to-cart-sauce-labs-bike-light']")).click();

	}

}
