package com.RanfordBank.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataProvider {

	static Workbook book;
	static Sheet sheet;

	public static String TESTDATAPATH = "/Users/prave/OneDrive/Desktop/EclipsePrograms/BankingRanfordApplication/TestData/testData.xlsx";

	public static Object[][] getDataFromExcel(String sheetName) {
		FileInputStream fil = null;
		try {
			fil = new FileInputStream(TESTDATAPATH);

		} catch (Exception e) {
			System.out.println("Not able to read excel path");
		}

		try {
			book = WorkbookFactory.create(fil);
		} catch (Exception e) {
			System.out.println("No file found");
		}

		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {  // Row 0
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {  // Row 0 =  Totals Columns
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}
		return data;
	}

}
