package MapInterface;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

      //Map Interface - Hashmap & HashTable
		
		Hashtable<Integer, String> HT = new Hashtable<>();
		
		//Insert the element
		
		HT.put(2, "john");
		HT.put(22, "Sumit");
	  //HT.put(null, "eva"); // java.lang.NullPointerException
		//HashTable does not allow null key
		HT.put(32, "Rohit");
		HT.put(35, "Sumit");
		HT.put(13, "Rahul");
	 //	HT.put(14, null);    // java.lang.NullPointerException
		//HashTable does not allow null Value
		
		System.out.println(HT);
		
		System.out.println(HT.remove(35));
		System.out.println(HT);
		
		System.out.println(HT.containsKey(35));  //false
		System.out.println(HT.containsKey(22));  //true
		
		System.out.println(HT.containsValue("Sumit"));  //true
		System.out.println(HT.containsValue("Rahul"));  //true
		
		System.out.println(HT.isEmpty());  //False
		
		System.out.println(HT.keySet());
		System.out.println(HT.values());
		
		
		for(Object obj : HT.keySet()) {
			System.out.println(obj+" "+HT.get(obj));
		}

	}

}
