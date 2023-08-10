package StarPattern;

public class StarPattern {

	public static void main(String[] args) {
		
		int K=0;
		
		for(int i=1; i<=7; i++) {
			
			if(i<=3)
				K++;
			else
				K--;
			for(int j=1 ; j<=5; j++) {
				 
				if(j>=4-K && j<=2+K) {
					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
