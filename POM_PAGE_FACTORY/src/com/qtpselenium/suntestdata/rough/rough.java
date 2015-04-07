package com.qtpselenium.suntestdata.rough;

import org.testng.SkipException;

import com.qtpselenium.util.Constants;
import com.qtpselenium.util.TestUtil;
import com.qtpselenium.util.Xls_Reader;

public class rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+ "\\src\\com\\qtpselenium\\data\\testdata.xlsx");
		System.out.println(System.getProperty("user.dir")+ "\\src\\com\\qtpselenium\\data\\testdata.xlsx");
		System.out.println(TestUtil.IsExecutable("TC20", reader));
		*/
		
		System.out.println(TestUtil.isElementPresent(Constants.acceptCookie));
		
		
		
	}

}
