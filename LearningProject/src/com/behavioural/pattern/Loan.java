package com.behavioural.pattern;

public class Loan {
String loanID;
String customerName;
float loanAmount;
public Loan(String id, String custName, float loanAmt) {
	this.loanID=id;
	this.customerName=custName;
	this.loanAmount=loanAmt;
}
public String getLoanId() {
	return this.loanID;
}

public String getCustName() {
	return this.customerName;
}
public float getLoanAmount() {
	return this.loanAmount;
}
}
