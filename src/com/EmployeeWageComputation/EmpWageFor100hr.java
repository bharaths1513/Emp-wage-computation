package com.EmployeeWageComputation;

public class EmpWageFor100hr {

	public static void main(String[] args) {
		int Fulltime = 1;
		int Parttime = 2;
		int Emprateperhr = 20;
		int NumOfWorkingDays = 20;
		int Maxworkinghrsinmonth = 100;
		int emphr = 0;
		int empwage = 0;
		int TotalEmpWage = 0;
		int Totalworkinghrs = 0;
		int Totalworkingdays = 0;
		
		
		
		while(Totalworkinghrs < Maxworkinghrsinmonth && Totalworkingdays < NumOfWorkingDays)
		{
			Totalworkingdays++;
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
			Totalworkinghrs += emphr;
			System.out.println("day# "+Totalworkingdays+ " Emp hrs is: "+Totalworkinghrs);
		System.out.println("Emp Wage "+empwage);
	
		}
		
			TotalEmpWage = Totalworkinghrs*Emprateperhr;
			System.out.println("\n");
			System.out.println("Total hrs Worked by Employee in a Month is: "+Totalworkinghrs);
			System.out.println("The Total Employee wage is: "+TotalEmpWage);


	}

}
