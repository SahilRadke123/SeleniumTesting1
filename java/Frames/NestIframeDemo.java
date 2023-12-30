package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestIframeDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DHEERAJ\\eclipse-workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.tagName("input")).sendKeys("This is txt msg");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement dropDownElement = driver.findElement(By.id("animals"));
		Select dropdown = new Select(dropDownElement);
		dropdown.selectByVisibleText("Baby cat");

	}

}
