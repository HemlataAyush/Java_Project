package Encapsulation;

import java.security.PrivateKey;

public class Employeedata {

	// implement Encapsulation
	 //private data variable can not access directly from outside the class
			
			
	private int IDNumber;
	private String EmpName; 
	private int EmAge;
	
	public static void main(String[] args) {
		
		Employeedata ED = new Employeedata();
		ED.setIDnumber(678900);
		ED.SetEmpName("Rahul");
		ED.setEmpAge(30);
		
		System.out.println("Emplyoee Number is : "+ED.getNumber());
		System.out.println("Emplyee Name is : "+ED.getEmpName());
		System.out.println("Emplyee Age is : "+ED.getEmpAge());
		

	}
	
	public int getNumber() {
		return IDNumber;
	}
	
	public void setIDnumber(int IDnumber) {
		this.IDNumber = IDnumber;	
	}
	
	public String getEmpName() {
		return EmpName;
		
	}
	
	public void SetEmpName(String EmpName) {
		this.EmpName = EmpName;
		
	}
	
	public int getEmpAge() {
		return EmAge;
	}
	
	public void setEmpAge(int EmAge) {
		this.EmAge = EmAge;
	}

}
