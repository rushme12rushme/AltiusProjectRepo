package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelWithoutHardCoding {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis = new FileInputStream("./data/CreateCustomer.xlsx");
 Workbook wb = WorkbookFactory.create(fis);
  int RowCount = wb.getSheet("CreateCustomer").getLastRowNum();
 System.out.println(RowCount);
 short  CellCount = wb.getSheet("CreateCustomer").getRow(0).getLastCellNum();
 System.out.println(CellCount);
 for(int i=1;i<=RowCount;i++)
 {
	 for(int j=0;j<CellCount;j++)
	 {
		 String id=wb.getSheet("CreateCustomer").getRow(i).getCell(j).getStringCellValue();
		 System.out.print(id+" ");
		 
	 }
	 System.out.println();
 }
	}

}
