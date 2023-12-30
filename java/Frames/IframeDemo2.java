package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DHEERAJ\\eclipse-workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//driver.switchTo().frame(0);
		
		//driver.switchTo().frame("packageListFrame");
		
		//WebElement iframeElement = driver.findElement(By.name("packageListFrame"));
		//driver.switchTo().frame(iframeElement);
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();

	}

}
