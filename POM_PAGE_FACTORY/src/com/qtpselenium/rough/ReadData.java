package com.qtpselenium.rough;

import com.qtpselenium.util.TestUtil;
import com.qtpselenium.util.Xls_Reader;

public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(System.getProperty("user.dir"));

		Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")
				+ "\\src\\com\\qtpselenium\\data\\testdata.xlsx");
		System.out.println(TestUtil.IsExecutable("TC1", reader));
		/*
		 * int rownum = reader.getRowCount("TestCases"); int colcount =
		 * reader.getColumnCount("TestCases"); //System.out.println(rownum); for
		 * (int i=1; i<=rownum; i++) { if(reader.getCellData("TestCases",
		 * "Run Mode", i).equals("Y"))
		 * System.out.println(reader.getCellData("TestCases", "TCID", i)); }
		 */
	}

}
