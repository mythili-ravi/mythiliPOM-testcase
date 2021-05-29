package week6.assignments.output;

import org.testng.annotations.Test;

import week6.assignments.common.PreAndPostStep;
import week6.assignments.testcase.Login;
import week6.assignments.testcase.LoginProposal;

public class CreateNewProposal extends PreAndPostStep {
	@Test
	public void createnewproposal() throws InterruptedException {
		new LoginProposal()
		.username()
		.password()
		.enternewpage().enterproposalmenu().clicknewproposal().getproposalnumber().entertemplatediscription().submitbuttonproposal();
		
		

	
	}

}
