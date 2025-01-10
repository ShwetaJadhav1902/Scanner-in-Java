package com.scanner;

import java.util.Scanner;

public class MainApp {
	
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("EnterEmployee Information!!!");
			System.out.println("=======================================================================");
			
			System.out.println("Enter Employee id:");
			int id=sc.nextInt();
			System.out.println("-------------------------------------------------------------------------");
			
			
			
			System.out.println("Enter Employee Name:");
			String name=sc.next();
			System.out.println("-------------------------------------------------------------------------");
			
			
			System.out.println("Enter Employee Basic Salary:");
			int bsal=sc.nextInt();
			System.out.println("-------------------------------------------------------------------------");
			
			
			System.out.println("Enter Employee Home Rent Allowance:");
			double hra=sc.nextDouble();
			System.out.println("-------------------------------------------------------------------------");
			
			System.out.println("Enter Employee DA:");
			double da=sc.nextDouble();
			System.out.println("-------------------------------------------------------------------------");
			
			System.out.println("choice one of the following:"
			+"\n 1.Manager"
			+"\n 2. SalesExecutive"
			+"\n 3. Developer");
			
			int op=sc.nextInt();
			System.out.println("--------------------------------------------------------------------------");
			
			Employee emp;
			if(op==1) {
				System.out.println("Enter incentive amount for manager");
				double inc=sc.nextDouble();
				System.out.println("-----------------------------------------------------------------------");
				emp=new Manager(id,name,bsal,hra,da,inc);
				emp.printInfo();
			}
			else if(op==2) {
				System.out.println("Enter travel allowance for salesExecutive");
			double travallo=sc.nextDouble();
			System.out.println("-----------------------------------------------------------------------");
			emp=new Salexe(id,name,bsal,hra,da,travallo);
			emp.printInfo();
				
			}else if (op==3) {
				System.out.println("Enter night work allowance for developer");
				double nightshift=sc.nextDouble();
				System.out.println("-----------------------------------------------------------------------");
				emp=new Developer(id,name,bsal,hra,da,nightshift);
				emp.printInfo();
			}else {
				System.out.println("invalid option!!!");
			}
		}
		
}
