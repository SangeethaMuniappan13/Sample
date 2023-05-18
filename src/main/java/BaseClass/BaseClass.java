package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//public static String ChromedriverPath = "/Users/SA20463801/Downloads/CD Folder/CD";
		public static String URL = "https://www.irctc.co.in/nget/train-search";
		public static WebDriver driver;
		public static Actions act;

		@BeforeTest
		public static void start() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			act = new Actions(driver);
			// maximize
			driver.manage().window().maximize();

			driver.get(URL);

		}
		

	@AfterTest
		public static void end() {
			driver.quit();

		}

}
