package week6.assignments.output;

import org.testng.annotations.Test;

import week6.assignments.common.PreAndPostStep;
import week6.assignments.testcase.Login;

public class CreateNewIncident extends PreAndPostStep {
	@Test
	public void createnewincident() throws InterruptedException {
		new Login()
		.username()
		.password()
		.enternewpage()
		.enterincidentmenu()
		.getincidentnumber().entercaller()
		.entershortdiscription()
		.submitbutton().checkincidentnumberpresent();

	
	}

}
