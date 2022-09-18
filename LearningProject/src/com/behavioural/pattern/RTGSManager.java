package com.behavioural.pattern;

public class RTGSManager extends Approver{

	@Override
	public void processRequest(Loan loan) {
		if(loan.getLoanAmount()<5000000) {
			System.out.println(this.getClass().getSimpleName()+" Approved Loan request id : "+loan.getLoanId()+" for Customer :  "+loan.getCustName());
			
		}else if(successor!= null)
		{
			successor.processRequest(loan);
		}
	}

}
