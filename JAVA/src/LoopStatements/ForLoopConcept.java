package LoopStatements;

public class ForLoopConcept {

	public static void main(String[] args) {
	//1. 
           for(int i = 0; i<=10; i++) {  //valid
        	   System.out.println(i);
           }
           
      //2.
           for(int i =0;true;i++) {
        	   System.out.println("hello");
           }
     //3.
           for(int i =0;false; i++) { //invalid
        	   System.out.println("hello");
           }
     //4. 
           for(int i=0,j=2,k=3; i<=0; i++) { //valid
        	   System.out.println("hello");
           }
     //5.
           for(String s="pune"; s <=0 ; s++) {//invalid
           
        	   System.out.println("hello");
           }
     //6.
           for(int i=1; i<={; i++ ) { //invalid
        	   System.out.println(i);
           }
      //7. 
        	   for(;;) {//valid
        		   System.out.println("hello");
        	   }
           
           
    }
}
}
	
