package com.Actitime.GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author jayth
 *
 */
public class FileLibrary {
	/**
	 * this class is generic class which is have non static method to perform data drivern from property file 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromProperty(String key) throws IOException {
		FileInputStream fis= new FileInputStream("./Testdata/commondata.property");
		Properties p=new Properties();
		p.load(fis);// TO LOAD THE FILE
		String value = p.getProperty(key);
		return value;
	}
/**
 * this method is use to read the date frm excel file
 * @param sheetname
 * @param row
 * @param cell
 * @return
 * @throws IOException 
 * @throws EncryptedDocumentException 
 * 
 */
	public String readDataFromExcelFile(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis1 =new FileInputStream("./Testdata/excelfile.xlsx");
		Workbook wb=WorkbookFactory.create(fis1);
		String value=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
}
