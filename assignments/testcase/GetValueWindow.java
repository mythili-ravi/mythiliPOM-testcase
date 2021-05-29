package week6.assignments.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import week6.assignments.common.PreAndPostStep;

public class GetValueWindow extends PreAndPostStep{


public void checkmethod() {
	

	
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(text,Keys.ENTER);
	
	
	String text2=driver.findElement(By.xpath("(//tr[@collapsed='true']//td)[3]")).getText();
	 System.out.println( text2);
	 if(text2.equals(text))
	 {
		 System.out.println("New incident number created successfully");
	 }
	 else
	 {System.out.println("Failed to create incident number");
    
}
	
}}


