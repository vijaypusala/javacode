package com.oops;

public class Loan {
	void bank(String name,int age,int aadhar,String purpose) {
		System.out.println("name is"+name+"age is "+age+"aadhar is"+aadhar+"the purpose is"+purpose);
	}

	public static void main(String[] args) {
		Loan details=new Loan();
		details.bank("vijay",24,23232,"educational loan");

	}
		
	}
