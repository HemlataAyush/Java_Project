package LogicalProgram;

public class Fibonaccisseries {

	public static void main(String[] args) {
		
		
		//FS = Next number is the sum of previous  two number
		
		//0,1,2,3,5,8,13,21,34,55,........
		int a = -1, b= -2, c;
		
  		for(int i=1; i<=10; i++) {
			
			c= a+b;
			System.out.println(" "+c);
			a = b;  //1
			b = c;  //0
		
		
		}

		

	}

}
