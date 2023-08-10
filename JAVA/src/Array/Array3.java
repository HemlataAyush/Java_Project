package Array;

public class Array3 {

	public static void main(String[] args) {
		
		//String st[] = new String[-2]; // No - negative Array size Exception
		
		String st[] = new String[4];
		
		st[0] = "hema";
		st[1] = "!@#$%%";
		st[2] = "test";
		st[3] = "1234";
		
		System.out.println(st[2]);
		
		System.out.println();
		
		for(int i=0 ; i<st.length; i++) {
			System.out.println(st[i]);
		}
		
		

	}

}
