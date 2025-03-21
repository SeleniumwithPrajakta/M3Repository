package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToreadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// To specitfy the path of excel file

		FileInputStream fis = new FileInputStream("./testData./testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet("ipl");

		Row row = sheet.getRow(0);

		Cell cell = row.getCell(1);

		String data = cell.getStringCellValue();
		System.out.println(data);

	}

}
