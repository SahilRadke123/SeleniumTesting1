package Maven123;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SecondTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DHEERAJ\\eclipse-workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.saucedemo.com");
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		String CurrentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(CurrentWindowHandle);
		
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		driver.findElement(By.cssSelector("button[nsme*=light]")).click();

	}

}
