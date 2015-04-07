package com.qtpselenium.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qtpselenium.testcases.TestBase;

public class TestUtil {

	public static boolean IsExecutable(String TestCase, Xls_Reader reader) {
		for (int i = 2; i <= reader.getRowCount("TestCases"); i++) {
			// check whether test case exist or not
			if (reader.getCellData("TestCases", "TCID", i).equals(TestCase)) {
				// check whether run mode is Y
				if (reader.getCellData("TestCases", "Run Mode", i).equals("Y")) {
					return true;
				}
			} 
				

		}
		// if test case does not exist
		return false;
	}
	
	public static void takeScreenshot(String picName)
	{
		
		File srcFile = ((TakesScreenshot)TestBase.driver).getScreenshotAs(OutputType.FILE);
	    try {
			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"\\screenShots\\"+picName+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean isElementPresent(String xapth)
	{
		try
		{
			int num= TestBase.driver.findElements(By.xpath(xapth)).size();
			//System.out.println("in isElementPresent function and value of num is: " +num);
			if(num!=0)
				return true;
			else 		
			return false;
		}catch (Throwable t)
		{
			return false;
		}
		
		
		
	}
	
	//public static boolean
	
}
