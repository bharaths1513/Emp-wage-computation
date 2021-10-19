package com.EmployeeWageComputation;

public class Emp_Check {

	public static void main(String[] args) {
		int Fulltime = 1;
		double empCheck = Math.floor(Math.random()*10)%2;
		System.out.println("The Random number is: "+empCheck);
		
		if(empCheck == 1)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is absent");
		}

	}

}
