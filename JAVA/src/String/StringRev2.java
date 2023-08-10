package String;

import java.util.Arrays;

public class StringRev2 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		arr[0] =1;
		arr[1] =2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(arr.length);
		
		for(int i=0; i>arr.length ;i++) {
		
        System.out.println(arr[i]+" ");
	}
		
		for(int j=4; j>=0; j--) {
			System.out.println(arr[j]);
		}
		

}
}
