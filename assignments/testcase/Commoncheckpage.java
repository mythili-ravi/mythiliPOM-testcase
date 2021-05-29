package week6.assignments.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import week6.assignments.common.PreAndPostStep;

public class Commoncheckpage extends PreAndPostStep {
	
	public StateChange gettheincident() {
		driver.switchTo().frame("gsft_main");
		
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(text,Keys.ENTER);
		
		driver.findElement(By.xpath("//td[@class='vt']")).click();
		driver.switchTo().defaultContent();
		return new StateChange();
		}

}
