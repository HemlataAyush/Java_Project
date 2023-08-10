package Array;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {2,3,4,5,6,7,8,9};
        System.out.println(arr.length);
        System.out.println("Orignal arry");
        
        for(int i=0; i<arr.length; i++) {
        	System.out.println(arr[i]);
        }
        
        System.out.println();
        System.out.println("Reverse array");
        
        for(int j=7; j>0; j--) {
        	System.out.println(arr[j]);
        }
	}

}
