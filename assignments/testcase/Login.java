package week6.assignments.testcase;

import org.openqa.selenium.By;

import week6.assignments.common.PreAndPostStep;

public class Login extends PreAndPostStep {

	public Login username() {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.switchTo().defaultContent();
		return this;
		}
	public Login password() {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_password")).sendKeys("India@123");
		driver.switchTo().defaultContent();
		return this;	
	}
	public Home enternewpage() throws InterruptedException {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		return new Home();	
		
	}
	
}

