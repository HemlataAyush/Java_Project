package Array;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		char c1[] = new char[5];
		
		c1[0] = 'A';
		c1[1] = 'C';
		c1[2] = '1';
		c1[3] = '3';
		c1[4] = 'E';
		
		System.out.println(c1);
		
		System.out.println(c1.length);
		
		for(int i = 0; i<c1.length; i++) {
			System.out.println(c1[i]);
		}
		
		System.out.println();
		Arrays.sort(c1);
		
		for(int i=0; i<c1.length; i++) {
			System.out.println(" "+c1[i]);
		}
		
		

	}

}
