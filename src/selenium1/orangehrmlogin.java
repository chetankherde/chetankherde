package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmlogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("textusername"));
		username.sendKeys("admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}

}
