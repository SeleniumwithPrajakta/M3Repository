package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchThe {
//Unstructured list will give you toString exception

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("ipl");

		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);

		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(cellCount);

		String[][] iplArr = new String[rowCount][cellCount];

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {

				iplArr[i][j] = sheet.getRow(i).getCell(j).toString();

			}
		}

		for (String[] arr2 : iplArr) {
			for (String data : arr2) {
				System.out.print(data + " ");
			}
			System.out.println();
		}

	}
}
