package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingInSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        
        driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)");
        
        driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_38']"))
      //  Actions act = new Actions(driver);
       
         }

}
