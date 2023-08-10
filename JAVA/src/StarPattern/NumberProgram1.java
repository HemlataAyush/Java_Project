package StarPattern;

public class NumberProgram1 {

	public static void main(String[] args) {
	
		for(int i=1; i<=5; i++) {   //Outloop -row
			
			for(int j=1; j<=5; j++) {
			  
				if(j<=i) {
					System.out.print(i+" ");
				}
				else {
					System.out.print(" ");
				}
			
			}
		         System.out.println();
		}
	}

}
