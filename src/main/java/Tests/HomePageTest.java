package Tests;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.HomePages;

public class HomePageTest extends BaseClass{
	@Test
	public void TC1() {
		HomePages.ClickOnFromInputField();
		
		
	}
	@Test
	public void TC2() {
		
		HomePages.ClickOnDateField();
		
	}

}
