package Readdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Second {
	
	public static void main (String [] args) throws IOException {
		
     String path = "C:\\Users\\Admin\\Desktop\\nutandhomse.xlsx";
     
     FileInputStream file = new FileInputStream(path);
     
     XSSFWorkbook workbook = new XSSFWorkbook(file);
     
     String Data= workbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();//firstname
     String Data1 =workbook.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();//nutan
     String Data2 = workbook.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();//dhomse
     String Data3 = workbook.getSheetAt(0).getRow(0).getCell(1).getStringCellValue();
     System.out.println(Data);
     System.out.println(Data1);
     System.out.println(Data2);
     
     
	}

}