package week6.assignments.testcase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import week6.assignments.common.PreAndPostStep;

public class NewRecordProposal extends PreAndPostStep {
	
	public NewRecordProposal getproposalnumber() {
		driver.switchTo().frame("gsft_main");
		String num1 = driver.findElement(By.id("std_change_proposal.number")).getAttribute("value");
		System.out.println( "incident Number"  +num1);
		driver.switchTo().defaultContent();
		return this;
}
	public NewRecordProposal entertemplatediscription() {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//span[@class='icon icon-lightbulb']")).click();
		Set<String> Windows1 = driver.getWindowHandles();
		List<String> WindowsFirst=new ArrayList<String>(Windows1);
			driver.switchTo().window(WindowsFirst.get(1));
			driver.findElement(By.linkText("Issue with email")).click();
			driver.switchTo().window(WindowsFirst.get(0));
			driver.switchTo().defaultContent();
		return this;
		}
	public SelfServiceViewproposal submitbuttonproposal() {  driver.switchTo().frame("gsft_main");
	driver.findElement(By.id("sysverb_insert")).click();
	driver.switchTo().defaultContent();
	return new SelfServiceViewproposal();
		}
	
	
}

