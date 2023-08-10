package Array;

public class Array7 {

	public static void main(String[] args) {
		
		String s1[] = new String[3];
		
		String s2[][] = new String[4][5];
		
		System.out.println(s2.length);  //total no row
		System.out.println(s2[2].length);  //total no columns
		
		System.out.println();
		//initialization
		
		//Row and Columns
		
		//First Row
		
		s2[0][0] = "A1";
		s2[0][1] = "A2";
		s2[0][2] = "A3";
		s2[0][3] = "A4";
		s2[0][4] = "A5";
		System.out.println(s2[0][4]);
		
		//Second Row 
		s2[1][0] = "A1";
		s2[1][1] = "A2";
		s2[1][2] = "A3";
		s2[1][3] = "A4";
		s2[1][4] = "A5";

	}

}
