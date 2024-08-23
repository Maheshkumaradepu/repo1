package Seleniumconcepts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Inputdata {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(
				"D:\\SeleniumCompleteFramework\\javaproject\\src\\main\\Testdata.xlsx");
		try (Workbook workbook = new XSSFWorkbook(fis)) {
			Sheet sheet = workbook.getSheetAt(0);
			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);

				// Check if the row is not null
				if (row != null) {
					// Get the Name from the second column (index 1)
					String name = row.getCell(1).getStringCellValue();

					// Get the id from the third column (index 2) - assuming ID is stored as an
					// integer
					int id = (int) row.getCell(2).getNumericCellValue();

					// Print the Name and ID
					System.out.println("Name: " + name + ", ID: " + id);
				}

			}

		}
	}
}
