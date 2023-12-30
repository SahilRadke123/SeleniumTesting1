package TESTNG;

import org.testng.annotations.Test;

public class LoanDepartment {
	@Test
	public void MobileLoginPersonalLoan() {
		System.out.println("Mobile Login Personal Loan");
	}
	
	@Test//(enabled=true)
	public void WebLoginPersonalLoan() {
		System.out.println("Web Login Personal Loan");
	}
	
	@Test//(enabled=false)
	public void APILoginPersonalLoan() {
		System.out.println("API Login Personal Loan");
	}
	
	
	@Test
	public void MobileLoginAutomobileLoan() {
		System.out.println("Mobile Login Automobile Loan");
	}
	
	@Test
	public void WebLoginAutomobileLoan() {
		System.out.println("Web Login Automobile Loan");
	}
	
	@Test
	public void APILoginAutomobileLoan() {
		System.out.println("API LoginAutomobile Loan");
	}

}
