package LoopStatements;

public class ForLoop7 {

	public static void main(String[] args) {
		// WAP addition of first 10 number
		//1+2+3+4+5+6+7+8+9+10=55
		
	int	sum = 0;
	
	//1<=10 - true
	//2<=10 - true
	
	//11<=10 - false
	for(int i=1 ; i<=10; i++) {
		
		//0=0+1
		//3=1+2
		//6=3+3
		
	  sum= sum+i;
	
	}
	
	    System.out.println(sum);

	}

}
