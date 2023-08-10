package Method;

public class Method11 {

	public static void main(String[] args) {
		Method11.Studentname("Hemalata");
		Method11.Studentinfo("Hemalata Patel ", 1);
		Method11.Studentname("Ayush");
		Method11.Studentinfo("Ayush Chaudhari ", 2);
		Method11.Studentname("Bhvya");
		Method11.Studentinfo("Bhavya Chaudhari ", 3);

	}
    
	public static void Studentname(String Name) {
		
		System.out.println(Name);
	}
	
	public static void Studentinfo(String Name, int No) {
		System.out.println("Student info - "+Name+No);
	}
}
