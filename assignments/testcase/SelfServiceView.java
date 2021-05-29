package week6.assignments.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import week6.assignments.common.PreAndPostStep;

public class SelfServiceView extends PreAndPostStep {
	
/*public SelfServiceView checkincidentnumberpresent() {
	
	
		driver.switchTo().frame("gsft_main");
		
	
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(text,Keys.ENTER);
		
		
		String text2=driver.findElement(By.xpath("//td[@class='vt']")).getText();
		//driver.findElement(By.xpath("(//tr[@collapsed='true']//td)[3]"))
		
		 System.out.println( text2);
		 if(text2.contentEquals(text))
		 {
			 System.out.println("New incident number created successfully");
		 }
		 else
		 {System.out.println("Failed to create incident number");
	    
	}
		return new SelfServiceView();
		
	}
	
}*/


public SelfServiceView checkstate() {
	
	
driver.findElement(By.xpath("//td[@class='vt']")).click();
String modifiedstate = driver.findElement(By.id("incident.state")).getAttribute("value");
System.out.println(modifiedstate);
String urgencynumber  = driver.findElement(By.id("incident.urgency")).getAttribute("value");
System.out.println(urgencynumber);
return this;
}
}
