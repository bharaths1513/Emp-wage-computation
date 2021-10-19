package com.EmployeeWageComputation;

public class Emp_Wage_in_Switch_Case {

	public static void main(String[] args) {
		int Fulltime = 1;
		int Parttime = 2;
		int Emprateperhr = 20;
		int emphr = 0;
		int empwage = 0;
		
		int empCheck = (int) Math.floor(Math.random()*10)%3;
		System.out.println("The Random number is: "+empCheck);
		
		switch (empCheck) {
		case 1: 
			emphr = 8;
			System.out.println("Employee is present for Full time ");
			System.out.println("Employee Daily Wage is: "+(emphr*Emprateperhr));
			break;
		case 2:
			emphr = 4;
			System.out.println("Employee is present for Part time ");
			System.out.println("Employee Daily Wage is: "+(emphr*Emprateperhr));
			break;
		default:
			emphr = 0;
			System.out.println("Employee is absent ");
			System.out.println("Employee Daily Wage is: "+(emphr*Emprateperhr));
			break;
				
		
		}

	}

}
