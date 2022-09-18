package com.behavioural.pattern;

public class BankManager extends Approver {

	@Override
	public void processRequest(Loan loan) {
	if(loan.getLoanAmount()<3000000)
	{
	System.out.println(this.getClass().getSimpleName()+" Approved Loan request id : "+loan.getLoanId()+" for Customer :  "+loan.getCustName());	
	}
	else if(successor!= null)
	{
		successor.processRequest(loan);
	}
	}
	
}
