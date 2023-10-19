package Assingnment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment3 {
	
	public static void main(String[] args) throws IOException  {
		//using if else if
		
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\git\\repository2\\11marchselenium\\Excel_sheet\\StudentInfo.xlsx");
		
		XSSFWorkbook w=new XSSFWorkbook(file);
		
		XSSFSheet sheet=w.getSheet("Sheet1");
        
		int Last_row_numbers=sheet.getLastRowNum();
		System.out.println("Last row number in file--->"+Last_row_numbers); //4
		
		int Last_column_number=sheet.getRow(0).getLastCellNum();
		System.out.println("Last column number in file--->"+Last_column_number); //5
		
		for(int i=0; i<=Last_row_numbers; i++) {  // 0 1 2 3 4
			XSSFRow r=sheet.getRow(i);
			 
			for(int j=0;j<Last_column_number;j++) { //0 1 2 3 4 
				
			XSSFCell cell=r.getCell(j);
			
			String cellvalue="";
				
			CellType celltype=cell.getCellType();   //CellType=class				
				
			if(celltype==CellType.STRING) {
			cellvalue=cell.getStringCellValue();
			}				
			else if (celltype == CellType.NUMERIC) {
            cellvalue = String.valueOf(cell.getNumericCellValue());
            }				
			else if (celltype == CellType.BOOLEAN) {
            cellvalue = String.valueOf(cell.getBooleanCellValue());
            }				
			System.out.print(cellvalue+"\t");								
			}
			System.out.println(" || ");
			
		}

	}

}


