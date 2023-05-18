package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.BaseClass;
import CommonActions.CommonActions;

public class HomePages extends BaseClass{
	
	
	// locators 
	public static WebElement FromInputField = driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
	public static WebElement dateField = driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input"));
	
	public static void  ClickOnFromInputField() {
		
		CommonActions.Onclick(FromInputField);
	}

	public static void  ClickOnDateField() {
		
		CommonActions.Onclick(dateField);
	}
	
	
	
	
	

}
