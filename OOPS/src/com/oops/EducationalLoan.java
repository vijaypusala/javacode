package com.oops;

public class EducationalLoan extends Loan {
	void Student(String name,String address) {
		System.out.println("name is "+name+"address is"+address);
	}


	public static void main(String[] args) {
		EducationalLoan educationalLoan=new EducationalLoan();
		educationalLoan.bank("vijay", 24, 1234434,"educationalloan" );
		educationalLoan.Student("sbi", "hyd");
		
		Loan loan=new Loan();
		loan.bank("icici", 77, 23, "krmrm");
		
		Loan l=new EducationalLoan();
		l.
		
		
		
//		// TODO Auto-generated method stub

	}

}
