package Readdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class First {
	
	public static void main (String [] args) throws IOException {
		
		String path ="C:\\Users\\Admin\\Desktop\\velocity class.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		String data1 = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		String data2 = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		System.out.println(data2);
	}

}
