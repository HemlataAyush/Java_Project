package ABC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class B {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

    FileInputStream file = new FileInputStream("C:\\Users\\hp\\git\\repository10\\11marchselenium\\Excel_sheet\\StudentInfo.xlsx");
    XSSFWorkbook sheet =new XSSFWorkbook(file);
     XSSFSheet Sheet = sheet.getSheet("Sheet1");
    int Row =Sheet.getLastRowNum();
    System.out.println(Row);
    short Cell = Sheet.getRow(0).getLastCellNum();
    System.out.println(Cell);
    for(int i=0; i<Row; i++) {
    	 XSSFRow row = Sheet.getRow(i);
    	for(int j=0; j<Cell; j++) {
    	XSSFCell cell = row.getCell(j);
    	
    	switch(cell.getCellType()) {
    	case STRING :
    		System.out.println(cell.getStringCellValue());
    		break;
    	case NUMERIC:
    		System.out.println(cell.getNumericCellValue());
    		break;
    	case BOOLEAN:
    		System.out.println(cell.getBooleanCellValue());
    	}
    	System.out.println(" || ");
    	}
    	
    	System.out.println();
    }
    
	}

}
