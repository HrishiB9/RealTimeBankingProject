package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.ConstantsFiles;

public class FetchURLFromExcel
{
	public static String getURL() throws IOException
	{
		System.out.println("IN");
		FileInputStream fs = new FileInputStream(ConstantsFiles.TestURL);
		XSSFWorkbook book = new XSSFWorkbook(fs);
		System.out.println(book);
		XSSFSheet sheet = book.getSheetAt(0);
		XSSFCell value = sheet.getRow(0).getCell(1);
		String url = value.toString();
		System.out.println(url);
		return url;
		
		
	}
	
	
}

