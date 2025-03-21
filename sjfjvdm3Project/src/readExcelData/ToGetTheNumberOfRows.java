package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToGetTheNumberOfRows {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx"); // To specify the path
		Workbook wb = WorkbookFactory.create(fis); // To make the file ready to read

		Sheet sheet = wb.getSheet("ipl"); // To get into the desired sheet
		int rc = sheet.getLastRowNum(); // To count the no of rows
		System.out.println(rc);

	}
}
