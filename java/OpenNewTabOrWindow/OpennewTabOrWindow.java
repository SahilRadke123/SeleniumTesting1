package OpenNewTabOrWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;

public class OpennewTabOrWindow {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DHEERAJ\\eclipse-workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2500);
        driver.get("https://www.google.com/");
        System.out.println("first page "+driver.getTitle());
        
       // driver.switchTo().newWindow(WindowsUtils.TAB); Remaining please refer from screenshot
	}

}
