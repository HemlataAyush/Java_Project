package parameteterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata {
	
	public static void main (String [] args) throws IOException {
		//to fetch String data from Excel sheet
		
		FileInputStream file = new FileInputStream ("C:\\Users\\hp\\git\\repository2\\11marchselenium\\Excel_sheet\\StudentInfo.xlsx");
		
		String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		//String data1 = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(data);
		//System.out.println(data1);
		
	}

}
