package com.EmployeeWageComputation;

public class EmpwageforMonth {

	public static void main(String[] args) {
		int Fulltime = 1;
		int Parttime = 2;
		int Emprateperhr = 20;
		int emphr = 0;
		int empwage = 0;
		int NumOfWorkingDays = 20;
		int TotalEmpWage = 0;
		
		
		
		for(int day = 0; day <=NumOfWorkingDays; day++)
		{
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			System.out.println("The Random number is: "+empCheck);
		switch (empCheck) {
		case 1: 
			emphr = 8;
			System.out.println("Employee is present for Full time ");
			
			break;
		case 2:
			emphr = 4;
			System.out.println("Employee is present for Part time ");
		
			break;
		default:
			emphr = 0;
			System.out.println("Employee is absent ");
			
			break;
		}
		empwage = (emphr*Emprateperhr);
		System.out.println("Emp Wage "+empwage);
		TotalEmpWage += empwage;
		System.out.println("Total Emp Wage is: "+TotalEmpWage);
		}
		
		System.out.println("\n");
		System.out.println("Total employee wage is: "+TotalEmpWage);


	}

}
