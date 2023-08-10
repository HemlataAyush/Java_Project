package WrapperClasses;

public class Test1 {

	public static void main(String[] args) {

      //WC are predefine class by java which can contains primitive data type and the 
	 //	wrapper class in java provider the machanism to convert primitive into object
	// and object into primitive datatype
		
		//Primitive data wrapper class
		
    /*   boolean = Boolean;
       byte = Byte;
       char = Character;
       int = Integer;
       float = Float;
       long = Long;
       short = Short;
       double = Double;
   */ 		   

		String S1= "200";
		String S2 = "400";
		
		System.out.println(S1+S2);
		
		int a = 300;
		System.out.println("Primitive "+a);
		
		Integer b = 30;
		System.out.println("Wrapper "+b);
	}

}
