package week6.assignments.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PreAndPostStep {
	 public static ChromeDriver driver;
	 
	 public static String text ;
	 public static  String  state1;
	 public static String urgency;
	 
	@BeforeMethod
	
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
	 driver =new ChromeDriver();
		driver.get("https://dev103117.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
}
	@AfterMethod
	public void exit(){
		driver.close();
		}
	
}
