package com.scanner;

public class Employee {
	private int empId;
	private String empName;
	private double basicSal;
	private double hra;
	private double da;
	public Employee(int empId, String empName, double basicSal, double hra, double da) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSal = basicSal;
		this.hra = hra;
		this.da = da;
	}
	
	public double calculateSalary() {
		return basicSal+hra+da;
	}
	
	public void printInfo() {
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee basic salary:"+basicSal);
		System.out.println("Employee hra:"+hra);
		System.out.println("Employee da:"+da);
	}

}


