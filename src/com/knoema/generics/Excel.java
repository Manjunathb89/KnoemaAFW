package com.knoema.generics;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static int getRowcount(String path,String Sheet)
	{
		int rc=0;
		try
		{
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			rc=wb.getSheet(Sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			
		}
		return rc;
	}
	
	public static int getColumncount(String path,String Sheet,int r)
	{
		int cc=0;
		try
		{
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			cc=wb.getSheet(Sheet).getRow(r).getLastCellNum();
		}
		catch(Exception e)
		{
			
		}
		return cc;
	}
	
	public static String getValue(String path,String Sheet,int r,int c)
	{
		String v="";
		try
		{
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			v=wb.getSheet(Sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			
		}
		return v;
	}
}
