package Practies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readata1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
   String S1 = "C:\\Users\\hp\\git\\repository2\\11marchselenium\\Excel_sheet\\StudentInfo.xlsx";
   
   FileInputStream str = new FileInputStream(S1);
   String Data = WorkbookFactory.create(str).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(Data);
	
	FileInputStream str2 = new FileInputStream(S1);
	 String str1 = WorkbookFactory.create(str2).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
     System.out.println(str1);
  
     FileInputStream Str3 = new FileInputStream(S1);
     double Data1 = WorkbookFactory.create(Str3).getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();
     System.out.println(Data1);
     
	
	
	
	}

}
