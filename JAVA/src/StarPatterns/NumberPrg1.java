package StarPatterns;

public class NumberPrg1 {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=5; i++) {

            for(int j=1; j<=5; i++) {
            	if(j <=i) {
            		System.out.println(i+" ");
            	}
            	else {
            		System.out.println(" ");
            	}
            }
            System.out.println();
		}

	}

}
