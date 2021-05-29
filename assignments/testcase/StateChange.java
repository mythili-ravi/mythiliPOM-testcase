package week6.assignments.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import week6.assignments.common.PreAndPostStep;

public class StateChange  extends PreAndPostStep{
	
	public StateChange typenewstate() {
		driver.switchTo().frame("gsft_main");
		WebElement state1 = driver.findElement(By.id("incident.state"));
		System.out.println("print the state"+ state1);
		Select st1 = new Select(state1);
		st1.selectByVisibleText("In Progress");
		System.out.println("modified state "+st1);
		driver.switchTo().defaultContent();
		return this;
}
	public StateChange typeurgency() {
		driver.switchTo().frame("gsft_main");
		WebElement urgency = driver.findElement(By.id("incident.urgency")); 
		System.out.println("print the urgency number"+ urgency);
		Select ur1 = new Select(urgency);
		ur1.selectByVisibleText("1-High"); 
		System.out.println("modified urgency value"+ ur1);
		driver.switchTo().defaultContent();
		return this;
	}
	public SelfServiceView update() {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("sysverb_update")).click();
		driver.switchTo().defaultContent();
		return new SelfServiceView();
		
	}
	
	

	

}
