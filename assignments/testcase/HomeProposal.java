package week6.assignments.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import week6.assignments.common.PreAndPostStep;

public class HomeProposal extends PreAndPostStep {
	public SelfServiceViewproposal enterproposalmenu() {
		driver.findElement(By.id("filter")).sendKeys("proposal",Keys.ENTER);
		  // driver.findElement(By.xpath("//div[text()='My Proposals']")).click();
		return new SelfServiceViewproposal();
		
	}
	

}


