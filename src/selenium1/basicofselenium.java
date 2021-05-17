package selenium1;


import org.openqa.selenium.chrome.ChromeDriver;

public class basicofselenium {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\driver\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https:\\www.google.com");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.navigate().refresh();
	driver.get("https:\\www.facebook.com");
	driver.navigate().back();
	Thread.sleep(2000);
}
}