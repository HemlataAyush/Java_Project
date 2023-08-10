package ControlStatement;

public class NestedifStatement {

	public static void main(String[] args) {

          int a = 100;
          int b = 200;
          int c = 300;
          
          if(a > b) {  // 100>200
        	  if(a > c) {
        		  System.out.println("A is greater number ");
        	  }
          }
          else if (b > c) { //200>300
        	  System.out.println(" B is greater number");
          }
          else {
        	  System.out.println("C is a greater number");
          }

	}

}
