package excelReadingWriting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {
	static String excelFilePath = "C:\\Users\\HP\\SoftwareTestingNotes\\ApplicationData.xlsx";
	DataFormatter formatter = new DataFormatter();

	public void excelSheetOperation(String excelFilePath) throws IOException {
		FileInputStream fis = new FileInputStream(excelFilePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Workbook workbook = new XSSFWorkbook(fis); // using upcasting technique

		int sheetCount = workbook.getNumberOfSheets();
		System.out.println("Number of sheets : " + sheetCount);

		int activeSheetIndex = workbook.getActiveSheetIndex();
		System.out.println("active sheet index : " + activeSheetIndex);

		for (int i = 0; i < sheetCount; i++) {
			System.out.println(workbook.getSheetName(i));
		}
		workbook.close();
	}

	public void excelRowOperation(String excelFilePath) throws IOException {
		FileInputStream fis = new FileInputStream(excelFilePath);

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("LoginData");

		int rowCount = sheet.getLastRowNum(); // it will return last row index, first row index is 0.
		System.out.println("Row count in LoginData sheet : " + rowCount);
		workbook.close();
	}

	public void excelCellOperation(String excelFilePath) throws IOException {
		FileInputStream fis = new FileInputStream(excelFilePath);

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("LoginData");

		Row row = sheet.getRow(0);

		int cellCount = row.getLastCellNum(); // Gets the index of the last cell contained in this row PLUS ONE
		System.out.println("Cell count in 0 row in LoginData sheet : " + cellCount);

		System.out.println("****Read and print the data of first row****");
		for (int i = 0; i < cellCount; i++) {
			System.out.print(row.getCell(i).getStringCellValue() + "\t"); // Get the value of the cell as a string
		}
		System.out.println();

		System.out.println("****Read all the data from LoginData sheet****");

//		for (int i = 0; i <= sheet.getLastRowNum(); i++) { // iterate over the rows
//
//			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) { // iterate over the cells in each row
//				Cell cell = sheet.getRow(i).getCell(j);
//				CellType cellType = cell.getCellType();
//				switch (cellType) {
//				case STRING:
//					System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + "\t");
//					break;
//				case NUMERIC:
//					System.out.print(sheet.getRow(i).getCell(j).getNumericCellValue() + "\t");
//					break;
//				case BOOLEAN:
//					System.out.print(sheet.getRow(i).getCell(j).getBooleanCellValue() + "\t");
//					break;
//				case BLANK:
//					break;
//				}
//
//			}
//			System.out.println();
//		}

		for (int i = 0; i <= sheet.getLastRowNum(); i++) { // iterate over the rows

			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) { // iterate over the cells in each row
				System.out.print(formatter.formatCellValue(sheet.getRow(i).getCell(j)) + "\t");
			}
			System.out.println();
		}
		workbook.close();
	}

	public void excelWritingOperation(String excelFilePath) throws IOException {
//		whenever you are writing into excel file make sure that file is closed.

		FileInputStream fis = new FileInputStream(excelFilePath);

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("LoginData");

//		Row row = sheet.getRow(1);
//		int lastCellNum = row.getLastCellNum();
//		row.createCell(lastCellNum).setCellValue("Pass");

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			int lastCellNum = sheet.getRow(i).getLastCellNum();
			sheet.getRow(i).createCell(lastCellNum).setCellValue("Pass");
		}

		FileOutputStream fos = new FileOutputStream(excelFilePath);
		workbook.write(fos);
		fos.flush();
		fos.close();
		workbook.close();
	}

	public static void main(String[] args) throws IOException {
		ExcelReading obj = new ExcelReading();
		obj.excelSheetOperation(excelFilePath);
		obj.excelRowOperation(excelFilePath);
		obj.excelCellOperation(excelFilePath);
		obj.excelWritingOperation(excelFilePath);
	}
}