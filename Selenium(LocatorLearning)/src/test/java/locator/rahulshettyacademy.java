package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rahulshettyacademy{
	
	@Test
	
	public void myfirstTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Thread.sleep(5000);
		
		WebElement header = driver.findElement(By.tagName("h1"));
		System.out.println(header.getText());
		
		//checkboxlocator 
		WebElement checkbox1lc = driver.findElement(By.id("checkBoxOption1"));
		checkbox1lc.click();
		Thread.sleep(5000);
		
		WebElement href = driver.findElement(By.className("blinkingText"));
		System.out.println(href.getText());
		
		// find tagname
		
		WebElement hrefan1findtagname = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
		System.out.println(hrefan1findtagname.getTagName());
		
		
		
		
		
		// another way to find element by using link text 
	
		WebElement hrefan2 = driver.findElement(By.partialLinkText("ResumeAssistance"));
		System.out.println(hrefan2.getText());
		
		
		WebElement xpathloc= driver.findElement(By.xpath("//input[@id=\"autocomplete\"]"));
		xpathloc.sendKeys("Hi , I am new locator learning ");
		
		//Thread.sleep(5000);
		
		
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