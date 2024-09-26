package app_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElemets {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		//getWindowHandel
//		
//		String Windowid = driver.getWindowHandle();
//        System.out.println(Windowid);
		Thread.sleep(2500);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		//getWindowHandels
		
		
		Set<String> WindowIdsList = driver.getWindowHandles();
		
		//Frist Method - Iterator
		
//		Iterator<String> it = WindowIdsList.iterator();
//		
//		String ParentId = it.next();
//		System.out.println(ParentId);
//		
//		String Childid = it.next();
//		System.out.println(Childid);
		
		//Second method using List/Array
		
//		List<String> Windid = new ArrayList();
//		
//		String Paentid = Windid.get(0);
//		System.out.println(Paentid);
//		
//		String Childid = Windid.get(1);
//		System.out.println(Childid);
//		
//		Thread.sleep(2500);
//		driver.switchTo().window(Childid);
//		Thread.sleep(2500);
		
		
		//third method
		
		for (String windid : WindowIdsList) {
			
			driver.switchTo().window(windid);
			
		}
		
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		
		
		
		
		
		
	
		

	}

}
