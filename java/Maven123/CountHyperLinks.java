package Maven123;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CountHyperLinks {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DHEERAJ\\eclipse-workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		System.out.println("Total links on webpages: " + linkElements.size());

		for (WebElement e1 : linkElements) {
			System.out.println(e1.getText());
		}
		driver.close();
	}

}
