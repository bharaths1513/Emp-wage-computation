package com.EmployeeWageComputation;

import java.util.Scanner;

public class AccountDetails {
		static Long Accountnum;
		static String Bankname;
		static int age;
		static String Candidatename;
		static String Ifsc_Code;
		

	public static void main(String[] args) {
		
		BankName();
		IFSC_Code();
		AccountNum();
		CandidateName();
		CandidateAge();
		output();

	}
	static void BankName() {
		Scanner o=new Scanner(System.in);
		System.out.println("Enter Name of The Bank Name ");
		Bankname=o.nextLine();
		
	}
		
	static void AccountNum()
	{
		Scanner o=new Scanner(System.in);
		System.out.println("Enter Account Number");
		Accountnum=o.nextLong();
		
		
	}
	static void IFSC_Code()
	{
		Scanner o=new Scanner(System.in);
		System.out.println("Enter IFSC Code of Bank");
		Ifsc_Code= o.nextLine();
	}
	
	static void CandidateName()
	{
		Scanner o=new Scanner(System.in);
		System.out.println("Enter Candidate name");
		Candidatename=o.nextLine();
		
	}
	static void CandidateAge()
	{
		Scanner o=new Scanner(System.in);
		System.out.println("Enter Candidate Age");
		age=o.nextInt();
	}
	
	static void output()
	{
		System.out.println("Candidate Bank detials: ");
		System.out.println("\n");
		System.out.println("Bank Name is: "+Bankname);
		System.out.println("IFSC Code is:"+Ifsc_Code);
		System.out.println("Account number is: "+Accountnum);
		System.out.println("The Name of Candidate is: "+Candidatename);
		System.out.println("The Age of Candidate is: "+age);
		
	}

}
