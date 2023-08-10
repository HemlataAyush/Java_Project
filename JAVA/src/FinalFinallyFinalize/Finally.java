package FinalFinallyFinalize;


public class Finally {

	public static void main(String[] args) {

     //Finalize  is the method which is use to perform cleanup processing just before object id garbage collection
		
    Finalized F1 = new Finalized();
    
    F1 = null;
    
    System.gc();;

	}
	
	public void Demo() {
		
		System.out.println("Demo Method");
	}
	
	public void Finalize() {
		
		System.out.println("Finalized method executed");
	}

}
