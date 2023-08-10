package LogicalProgram;

public class Demo1 {
	
	public static void main(String[]args) {
	String Name = "Hemlata";
	String Revs ="";

	for(int i=Name.length(); i>=0; i++ ){
	Revs= Revs+Name.charAt(i);

	}
	System.out.println(Revs);

}
}