package Practies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData2 {
	
	public static void main(String[] args) throws IOException {

     FileInputStream file = new FileInputStream("C:\\Users\\hp\\git\\repository2\\11marchselenium\\Excel_sheet\\StudentInfo.xlsx");
     XSSFWorkbook Workbook = new XSSFWorkbook(file);
     XSSFSheet Sheet = Workbook.getSheet("Sheet1");
     int Row = Sheet.getLastRowNum();
     System.out.println(Row); 
     
     short Cell = Sheet.getRow(1).getLastCellNum();
     System.out.println(Cell);
     
     for(int i=0; i<Row; i++) {
    	 
   	 XSSFRow row = Sheet.getRow(i);
    	 
   	 for(int j=0; j<Cell; j++) {
    		 
   	 XSSFCell cell = row.getCell(j);
    	 
   	 switch(cell.getCellType()) {
    	 
   	 case STRING :
    		 
   	 System.out.println(cell.getStringCellValue());
    	break;
    	
     case NUMERIC :
    		 
   	 System.out.println(cell.getNumericCellValue());
    	break;	 
     case BOOLEAN:
    		 
     System.out.println(cell.getBooleanCellValue());    		 
    	break; 
   	 }   	 
   	System.out.println(" || ");
     }
	 
     }
     

	}

}
