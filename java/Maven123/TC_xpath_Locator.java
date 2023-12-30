package Maven123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_xpath_Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DHEERAJ\\eclipse-workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.saucedemo.com");
		driver.findElement(By.tagName("input")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		String CurrentWindow = driver.getWindowHandle();
		driver.switchTo().window(CurrentWindow);
		//driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		List <WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element Size: "+elementList.size());
	}

}
