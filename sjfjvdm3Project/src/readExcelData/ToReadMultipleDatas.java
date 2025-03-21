package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDatas {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx"); // To specify the path
		Workbook wb1 = WorkbookFactory.create(fis); // To make the file ready to read

		Sheet sheet1 = wb1.getSheet("ipl"); // To get into the desired sheet
		int rc = sheet1.getLastRowNum(); // To count the no of rows

		for (int i = 1; i <= rc; i++) {

			// FileInputStream fis1 = new FileInputStream("./testData/testdata.xlsx");

			// Workbook wb = WorkbookFactory.create(fis);

			// Sheet sheet = wb.getSheet("ipl");

			Row row = sheet1.getRow(i);

			Cell cell = row.getCell(1);

			String data = cell.getStringCellValue();

			System.out.println(data);
			Thread.sleep(1000);
		}
	}

}
