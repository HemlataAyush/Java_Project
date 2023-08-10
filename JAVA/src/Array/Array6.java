package Array;

public class Array6 {

	public static void main(String[] args) {

     Object obj[] = new Object[5];
     
     obj[0] = 10;
     obj[1] = "Welcome";
     obj[2] = 'A';
     obj[3] = 12.4f;
     obj[4] = true;
     
     System.out.println(obj.length);
     
     for(int i =0; i<obj.length; i++) {
    	 System.out.println(obj[i]);
     }

	}

}
