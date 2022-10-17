package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rahulshettyacademadvancedxpath{
	
	@Test
	
	public void myfirstTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Thread.sleep(5000);
		

		// 1. xpath === //tagname[@ attribute ="value"]
		
		// 2. xpath = //tagname
		// 3. xpath= // parent tagname / child tagname
		// 4. 
		
		// 1. cssselector === tagname[attribute="value"]
		// 2.  cssselecor = parent tag name > child tagname 
		
		
		WebElement header = driver.findElement(By.tagName("h1"));
		System.out.println(header.getText());
		
		System.out.println("using css selector");
		
		WebElement header1 = driver.findElement(By.cssSelector("h1"));
		System.out.println(header1.getText());
		
		System.out.println("xpath");
		
		WebElement header2 = driver.findElement(By.xpath("//h1"));
		System.out.println(header2.getText());
		//checkboxlocator 
		
		
		
		WebElement xpathcssselector = driver.findElement(By.cssSelector("input[name='enter-name']"));
		xpathcssselector.sendKeys("Hi");
		
		// select button click 
		
		WebElement selctbutoonclick =driver.findElement(By.cssSelector("select[name=\"dropdown-class-example\"]"));
		selctbutoonclick.click();
		
		WebElement selctoptionclick =driver.findElement(By.cssSelector("option[value=\"option1\"]"));
		selctoptionclick.click();
		
		
		
		
		// locator finding gulo aro easy way te chroom er app selector hub diye kora jay 
		Thread.sleep(5000);
		//String gettext =driver.findElement(By.tagName("h1")).getText();
		//System.out.println(gettext);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}