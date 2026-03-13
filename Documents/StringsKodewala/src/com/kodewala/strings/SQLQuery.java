package com.kodewala.strings;
import java.util.Scanner;

public class SQLQuery{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Employee Department: ");
		String department=scan.nextLine();
		System.out.print("Enter the Employee Salary: ");
		//int salary=Integer.parseInt(scan.nextLine());
		int salary=scan.nextInt();
		scan.nextLine();
		System.out.print("Enter the Employee joining date: ");
		String joiningDate=scan.nextLine();
		System.out.println(" ");
		
		StringBuilder sb= new StringBuilder("SELECT * FROM employees WHERE 1=1 AND departament = '");
		sb.append(department+"'");
		sb.append(" AND salary = '").append(salary).append("'");
		sb.append(" AND joining_date = '"+ joiningDate).append("'");
		System.out.println(sb);
	}

}
