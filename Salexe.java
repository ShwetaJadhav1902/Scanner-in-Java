package com.scanner;

public class Salexe extends Employee{
	private double TravAllo;

	public Salexe(int empId, String empName, double basicSal, double hra, double da,double travAllo) {
		super(empId, empName, basicSal, hra, da);
		this.TravAllo=travAllo;
	}
	
	public double calculateSalary() {
		
		return super.calculateSalary()+TravAllo;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Salexe travaler alowance:"+TravAllo);
		System.out.println("Salexe total Salary:"+calculateSalary());

}
}
