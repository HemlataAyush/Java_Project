package LogicalProgram;

import java.util.Arrays;

public class MoveZerosToRight {

	
	public static void main(String[] args) {
		
		int[] inputsequence = {1,0,3,6,0,3,8,4,9,0,11,6};
		int[] resultSequence = moveOnesRight(inputsequence);
		
		System.out.println(Arrays.toString(resultSequence));

	}

	public static int[] moveOnesRight(int[] sequence) {
		
		int nonZeroCount =0;
		int[] newSequence = new int[sequence.length];
		
		for(int num:sequence) {
			
			if(num !=0) {
				newSequence[nonZeroCount] = num;
				nonZeroCount++;
			}
		}

		return newSequence;
	}

}
