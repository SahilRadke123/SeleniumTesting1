package Screenshotss;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CaptureScreenshotsForHalfSection {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DHEERAJ\\eclipse-workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2500);
        driver.get("https://www.seleniumframework.com/");
        
        //TakesScreenshot screenshot = ((TakesScreenshot)driver);
        WebElement section = driver.findElement(By.xpath("//a[@class='i_ a si144']"));
      
        
        File src = section.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\DHEERAJ\\eclipse-workspace\\Maven_project_demo\\Screeenshots\\section.png");
        FileUtils.copyFile(src, dest);
	}

}

