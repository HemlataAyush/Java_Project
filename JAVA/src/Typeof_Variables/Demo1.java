package Typeof_Variables;

public class Demo1 {

	  static int p =100;
	   int i = 10;
	
	public static void main(String[] args) {
		
		System.out.println(p);
		System.out.println(Demo2.d);
		Demo1 D1 = new Demo1();
		System.out.println(D1.i);
		
		Demo2 D3 = new Demo2();
		System.out.println(D3.c);
		
		D1.m1();

	}
	
	public void m1() {
		
		int j = 10;
		int k= 20;
		int s = j+k;
		System.out.println(s);
	}

}
