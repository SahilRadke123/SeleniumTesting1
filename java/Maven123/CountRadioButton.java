package Maven123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DHEERAJ\\eclipse-workspace\\SeleniumTesting\\Executables\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
        
        List <WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Total no. of radio buttons on webpage "+ radioButtonList.size());
        driver.close();
	}

}
