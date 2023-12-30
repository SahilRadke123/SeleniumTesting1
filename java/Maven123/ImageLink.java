package Maven123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DHEERAJ\\eclipse-workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
        
        String Title = driver.getTitle();
       
        if(driver.getTitle().equals("Title"))
        {
        	System.out.println("Passed");
        }
        else
        {
        	System.out.println("failed");
        }
	}

}
