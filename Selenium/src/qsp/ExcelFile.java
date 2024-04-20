package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/CreateCustomer.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String cellValue = wb.getSheet("CreateCustomer").getRow(0).getCell(1).getStringCellValue();
		System.out.println(cellValue);
	}

}
