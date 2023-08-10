package Encapsulation;

public class Empdata1 {

	public static void main(String[] args) {

      Employeedata ED = new Employeedata();
      
      ED.setIDnumber(4445);
      ED.SetEmpName("Hemlata");
      ED.setEmpAge(27);
      
      System.out.println("Emplyoee Number is : "+ED.getNumber());
      System.out.println("Emplyoee Name is : "+ED.getEmpName());
      System.out.println("Emplyoee Age is : "+ED.getEmpAge());

	}

}
