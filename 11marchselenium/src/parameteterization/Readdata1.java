package parameteterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata1 {
	
	public static void main (String [] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream("\\Users\\Admin\\Desktop\\StudentInfo.xlsx\"");
		
		
		String data1 = WorkbookFactory.create(file) .getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data1);
		
	
		
		
	}
	
	
	

}
