package app_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Methods {
	
	WebDriver driver;
	
	@Test
	public void lauch() {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://login.salesforce.com/?locale=in");
	
	String name = driver.getTitle();
    System.out.println(name);		
    
    driver.findElement(By.id("signup_link")).click();
    
    WebElement we =driver.findElement(By.xpath("//input[@name='UserFirstName']"));
    
    System.out.println("Dislayed"+we.isDisplayed());
    System.out.println("Enable"+we.isEnabled());
    
    we.sendKeys("Akhil Nalam");
    
    
    
	}

	

}
