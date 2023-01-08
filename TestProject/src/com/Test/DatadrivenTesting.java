package com.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class DatadrivenTesting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Harpika\\eclipse-workspace\\TestProject\\Excel\\Flipkart.xlsx");
		System.out.println("FileInputStream :" + fis);
		Workbook wb=WorkbookFactory.create(fis);	
		//System.out.println("Workbook :" + wb.getSheetName(0));
		Sheet sh=wb.getSheet("cart");
		System.out.println("Sheet :" +sh.getPhysicalNumberOfRows());
		Row r=sh.getRow(1);
		Cell c=r.getCell(0);
		System.out.println("Cell :" +c);
		String data=c.getStringCellValue();
		System.out.println("Data :" +data);

	}

}
