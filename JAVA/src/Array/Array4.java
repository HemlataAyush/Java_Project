package Array;

public class Array4 {

	public static void main(String[] args) {
		
		boolean []B1 = new boolean[3];   //correct
		
		B1[0] = true;
		B1[1] = true;
		B1[2] = false;
		//B1[3] = test;
		
		System.out.println(B1[1]);
		System.out.println();
		
		for(int i=0; i<B1.length; i++) {
			System.out.println(B1[i]);
		}

	}

}
