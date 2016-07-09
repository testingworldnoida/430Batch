package testing;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.Createdriver;

public class Case1 extends Createdriver {
	
	@Test
	public void tcase1()
	{
		ResourceBundle rb = ResourceBundle.getBundle("Element");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"))).perform();
		driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']")).click();
	}

}
