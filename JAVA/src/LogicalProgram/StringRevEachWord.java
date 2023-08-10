package LogicalProgram;

public class StringRevEachWord {

	public static void main(String[] args) {
		
		String str = "Hello good evening";
		//Expected Result - gnieve doog olleh
		//Expected = olleh doog gnieve
		
		String[] Word = str.split(" ");   //Spliteted string into words
		String RevS = "";
		
		for(String W : Word) {  //OuterLoop
		String StringWord ="";
		
		for(int i =W.length()-1; i>=0; i--) {  //ineer loop
			
			StringWord = StringWord+W.charAt(i);
		}
		
		RevS = RevS+StringWord+" ";
		
	    }
		System.out.println(RevS);

	}
}
