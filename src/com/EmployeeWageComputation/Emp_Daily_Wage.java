package com.EmployeeWageComputation;

public class Emp_Daily_Wage {

	public static void main(String[] args) {
		int Fulltime = 1;
		int Emprateperhr = 20;
		int EmpworkinghrFulltime = 8;
		double empCheck = Math.floor(Math.random()*10)%2;
		System.out.println("The Random number is: "+empCheck);
		
		if(empCheck == 1)
		{
			System.out.println("Employee is Present");
			System.out.println("Employee Daily Wage is: "+(Emprateperhr*EmpworkinghrFulltime));
		}
		else
		{
			System.out.println("Employee is absent");
			System.out.println("Employee Daily Wage is: "+0);
		}


	}

}
