package Array;

public class ArraySum {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,11}; // 32
		
		System.out.println(arr.length);
		
		int sum = 0;
		
		
		for(int i =0; i<arr.length; i++) {
			
			sum = sum +arr[i];
			
			//System.out.println("sum of all element "+sum);
		}
		System.out.println("sum of all element "+sum);
	}

}
