package week6.assignments.testcase;

import org.openqa.selenium.By;

import week6.assignments.common.PreAndPostStep;

public class SelfServiceViewproposal extends PreAndPostStep {
	public NewRecordProposal clicknewproposal() {
		 driver.switchTo().frame("gsft_main");
		   driver.findElement(By.id("sysverb_new")).click();
		   driver.switchTo().defaultContent();
		   return new NewRecordProposal();
	}

}
