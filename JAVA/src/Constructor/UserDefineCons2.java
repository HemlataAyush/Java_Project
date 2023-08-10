package Constructor;

import java.nio.file.spi.FileSystemProvider;

public class UserDefineCons2 {
	
	//1. var dec
			String Name;
			String Model;
			int Price;
			String Engin;
			

	public UserDefineCons2(String name1, String Model1, int Price1, String Engin1) {
		
	//2. ver int
		 Name = name1;
		 Model = Model1;
		 Price = Price1;
		 Engin = Engin1;
		 
	//	this. Name = Name;
	//	this. Model = Model;
	//	this. Price = Price;
	//	this. Engin = Engin;
		
		
	}
   
	public static void main(String[] args) {
		UserDefineCons2 UD1 = new UserDefineCons2("Kia","Seltos",200000000,"Manual");
		UserDefineCons2 UD2 = new UserDefineCons2("Honda", "City", 190000000, "Automatic");
		UserDefineCons2 UD3 = new UserDefineCons2("Tata","Nexo",500000000,"Manual");
		UserDefineCons2 UD4 = new UserDefineCons2("Maruti","800",50000000,"Automatic");
		
		System.out.println(UD1.Name+" "+UD1.Model+" "+UD1.Price+" "+UD1.Engin);
		System.out.println(UD2.Name+" "+UD2.Model+" "+UD2.Price+" "+UD2.Engin);
		System.out.println(UD3.Name+" "+UD3.Model+" "+UD3.Price+" "+UD3.Engin);
		System.out.println(UD4.Name+" "+UD4.Model+" "+UD4.Price+" "+UD4.Engin);

	}

}
