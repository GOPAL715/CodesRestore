package com.kodewala.strings;
import java.util.Scanner;

public class SQLGenerator
{

    public static void main(String[] args)
    {
	SQLGenerator generator = new SQLGenerator();
	generator.generateSql();
    }

    public void generateSql(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the Employee Id: ");
	int empId = scan.nextInt();
	System.out.print("Enter the Employee Salary: ");
	int salary = scan.nextInt();
	
	StringBuilder sb = new StringBuilder("select * from employee");
	if (empId != 0 && salary != 0)
	{
	    sb.append(" where empid is : " + empId);
	    sb.append(" and where salary is : " + salary);
	}  
	sb.append(";");

	System.out.println("SQL query is " + sb);

    }

}
