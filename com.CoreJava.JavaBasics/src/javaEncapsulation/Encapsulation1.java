package javaEncapsulation;

// private members of the class cannot be used outside of the class
class EmployeeData {
	private int empId;
	private double empSalary;

//	as variables are non-static getter and setter will be non-static
	public int getEmpId() { // getter method for empId
		return empId;
	}

	public void setEmpId(int empId) { // setter method for empId
		this.empId = empId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

//	provide public getter and setter method to access and update this private data
//	how to create or generate public getter and setter method
//	right on the program -> click on source -> click on generate getter and setter

}

public class Encapsulation1 {

	public static void main(String[] args) {
		EmployeeData obj = new EmployeeData();
//		System.out.println(obj.empId); // since empId is private we cannot access it
//		System.out.println(obj.empSalary); // since empSalary is private we cannot access it

		System.out.println("Initial empId : " + obj.getEmpId());
		obj.setEmpId(1014);
		System.out.println("empId after assigning some value : " + obj.getEmpId());

		System.out.println("Initial empSalary : " + obj.getEmpSalary());
		obj.setEmpSalary(2500.15);
		System.out.println("empSalary after assigning some value : " + obj.getEmpSalary());
	}
}
