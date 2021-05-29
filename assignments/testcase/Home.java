package week6.assignments.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import week6.assignments.common.PreAndPostStep;

public class Home extends PreAndPostStep {
	public NewRecord enterincidentmenu() {
		driver.findElement(By.id("filter")).sendKeys("incident",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Create New']")).click();
	
		//driver.findElement(By.xpath("//input[@id='filter']/following::div[text()='Incidents']")).click();
	  
		return new NewRecord();
		
	}
	

}


