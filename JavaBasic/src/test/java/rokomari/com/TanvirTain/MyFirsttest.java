package rokomari.com.TanvirTain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirsttest{
	
	@Test
	
	public void myfirstTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.rokomari.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(50000);
		driver.quit();
		
	}
}