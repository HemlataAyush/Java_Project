package Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList2 {

	public static void main(String[] args) {
   		
          ArrayList AL = new ArrayList();
          AL.add("A");
          AL.add("B");
          AL.add("Z");
          AL.add("S");
          AL.add("C");
          
          System.out.println(AL);
          
          //1. Addall
          
          ArrayList dublicate = new ArrayList();
          dublicate.addAll(AL);
          System.out.println(dublicate);
          
          // 2.  removeall
          
          dublicate.removeAll(AL);
          System.out.println(dublicate);
          
          //3. collections
          
          System.out.println(AL);
          
		  Collections.sort(AL);;
          System.out.println(AL);
          
          //
          Collections.sort(AL, Collections.reverseOrder());
          System.out.println(AL);
          
          //
          Collections.shuffle(AL);
          System.out.println(AL);


	}

}
