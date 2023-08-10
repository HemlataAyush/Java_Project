package Array;

public class Array1 {

	public static void main(String[] args) {
		
		int i1 = 10;
		// Array is collection of similar type of element/value
		//we can store fixed set in ava array
		//Array is index base and first element of the array is stored at 0th index and
		// last index n-1 (array name)
		
		//System.out.println(i1);
		//System.out.println(i2);
        
		//array declaration
		
		//syntax
		
		//datatype arrayname[] = new datatype[Size of array];
		
		int arr[] = new int[10];
		
		//2. Array initialization
		//syntax - arrayname[indexnumber]
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 190;
		arr[9] = 100;
		
		System.out.println(arr.length);
		
		System.out.println("Index 5 = "+arr[5]);
		System.out.println("Index 2 = "+arr[2]);
		//System.out.println(arr[9]);
		
		for(int i = 0; i <arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}

}
