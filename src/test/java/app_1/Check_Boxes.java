package app_1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_Boxes {

	public static void main(String[] args) {
		
		WebDriver driver;
        
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//driver.findElement(By.xpath("//input[@value='monday']")).click();
		
		List<WebElement> checkb = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
//		System.out.println(checkb.size());
//		
//		for (WebElement checkboxes : checkb) {
//			
//		String box =	checkboxes.getAttribute("id");
//		
//		if(box.equals("monday") || box.equals("sunday") ) {
//			checkboxes.click();
//		}
		
		int count = checkb.size();
		
		for(int i=0; i<count; i++) {
			
			if(i<4) {
				checkb.get(i).click();
			}
			
		}
		
		
	}

}
