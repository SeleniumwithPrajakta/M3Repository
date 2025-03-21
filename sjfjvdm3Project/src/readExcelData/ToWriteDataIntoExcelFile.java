package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteDataIntoExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis); // to make the file ready to read
		Sheet sheet = wb.getSheet("ipl"); // to set into the desired sheet

		Row row = sheet.createRow(9); // to get into the row

		Cell cell = row.createCell(1);// to create a new column
		cell.setCellValue("Punjab_Kings"); // t set the value of a column

		FileOutputStream fos = new FileOutputStream("./testData/testdata.xlsx");
		wb.write(fos);
	}
}
