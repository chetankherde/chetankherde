package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookLogIn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://mbasic.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id=\"signup-button\"]/input")).click();
		
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select sel = new Select(day);
		sel.selectByVisibleText("8");
		Thread.sleep(5000);
		
	  WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
	  Select selmonth = new Select(month);
	  selmonth.selectByValue("11");
	  Thread.sleep(5000);
	  
	 WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
	 Select selyear =new Select(year);
	 selyear.selectByIndex(29);
	 Thread.sleep(5000);
	  
	}

}
