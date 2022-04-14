package RedifMail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToRedif {

	public void TestDemo() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\DXC Selenium Automation Class\\Q3 Login to Specific Web Page\\ChromeBrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("ABC");
		driver.findElement(By.id("password")).sendKeys("abc@123");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]")).click();
		driver.quit();

	}

}
