package com.EmployeeWageComputation;

public class Emp_Part_Time_Wage {

	public static void main(String[] args) {
		int Fulltime = 1;
		int Parttime = 2;
		int Emprateperhr = 20;
		int EmpworkinghrFulltime = 8;
		int EmpworkinghrParttime = 4;
		double empCheck = Math.floor(Math.random()*10)%3;
		System.out.println("The Random number is: "+empCheck);
		
		if(empCheck == 1)
		{
			System.out.println("Employee is Present for Full time ");
			System.out.println("Employee Daily Wage is: "+(Emprateperhr*EmpworkinghrFulltime));
		}
		else if(empCheck == 2)
		{
			System.out.println("Employee is Present for Part time ");
			System.out.println("Employee Daily Wage is: "+(Emprateperhr*EmpworkinghrParttime));
		}
		else
		{
			System.out.println("Employee is absent");
			System.out.println("Employee Daily Wage is: "+0);
		}


	}

}
