package com.behavioural.pattern;

public class LoanAprroverMain {

	public static void main(String[] args) {
		//Here Approver Class Is been used to pass the other class without creating multi Object
		Approver assmanger,manager,rtgsManager;
		Loan loan;
		assmanger=new AssistantBankManager();
		manager= new BankManager();
		rtgsManager= new RTGSManager();
		assmanger.passToSuccessor(manager);
		manager.passToSuccessor(rtgsManager);
		loan=new Loan("10202","Harish",3000000);
		assmanger.processRequest(loan);
	}

}
