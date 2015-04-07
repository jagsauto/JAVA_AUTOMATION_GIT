package com.qtpselenium.rough;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qtpselenium.util.TestUtil;
import com.qtpselenium.util.Xls_Reader;

public class callDynamicReaddata {
	
	@Test(dataProvider="getLoginData")
	public void loginTest(Hashtable<String,String> data)
	{
		System.out.println(data.get("RunMode"));
		System.out.println(data.get("UserName"));
		System.out.println(data.get("Password"));

		
	}
	
	
	@DataProvider
	public Object[][] getLoginData(){
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\data\\newtestdata.xlsx");
		String testName="Login";
		return readDynamicdata.getData(testName, xls);
	}

}
