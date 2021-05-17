package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123"); 
		
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectAll\"]")).click();
		
		//WebElement checkbox = driver.findElement(By.xpath("//*[@id=\\\"ohrmList_chkSelectAll\\\"]"));
		
		
		
	}

}
