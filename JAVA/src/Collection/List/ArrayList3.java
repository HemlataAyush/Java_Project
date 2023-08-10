package Collection.List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {

          String arr[] = {"DOG","Elephant","Cat"};
          
          System.out.println(arr);
          
          for(String name : arr) {
        	  System.out.println(name);
          }
          
          //Convert array into arraylist
          
          ArrayList AL = new ArrayList(Arrays.asList(arr));
          System.out.println(AL);
          
	}
}
