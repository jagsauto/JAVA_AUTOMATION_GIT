package com.qtpselenium.rough;

import java.util.Hashtable;

import com.qtpselenium.util.Xls_Reader;

public class read_data_newformat {

	public static String testcase = "Login";
	public static Object[][] data = null;
	public static void main(String[] args) {
		

		
		// TODO Auto-generated method stub
		
		Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\data\\newtestdata.xlsx");
		//System.out.println(reader.getRowCount("TestData"));
		// to find test case
		int RowNum=0;
		
		for (int rowNum =0; rowNum<reader.getRowCount("TestData"); rowNum++)
		{
			
			if(reader.getCellData("TestData", 0, rowNum).equals(testcase))
			{
				System.out.println("Testcase found at line number: " + rowNum);
				RowNum=rowNum;
				break;
			}
				
		}
		if(RowNum==0)
		{
			System.out.println("Testcase does not exit");
			return;

		}
		int rowfound=RowNum+1;
		
		// to check number of rows of found test case
		int rows=0;
		int cols=0;
		//for (int rows=RowNum; rows<)
		
		//System.out.println(reader.getCellData("TestData", 0, 11));
		while(reader.getCellData("TestData", 0, RowNum)!="")
		{
			RowNum++;
			//System.out.println(RowNum);
			rows++;
			
		}
		System.out.println("no of rows in found test case are"+rows);
		
		while(reader.getCellData("TestData", cols, rowfound)!="")
		{
			//RowNum++;
			//System.out.println(RowNum);
			cols++;
			
		}
		
		System.out.println("no of cols in found test case are"+cols);
		System.out.println(rowfound);
		System.out.println(cols);
		System.out.println(RowNum);
		int arrrow= rows-1;
		System.out.println("value of arrow is :"+arrrow);
		//Object [][] data= new Object [arrrow][0];
		//Hashtable <String, String> table= null;
		//int index=0;
		data =new Object[arrrow][1];

		int index=0;
		Hashtable<String,String> table=null;
		for(int i=rowfound; i<=RowNum ; i++)
		{
			//table=new Hashtable <String,String>();
			table = new Hashtable<String,String>();
				for (int j=0; j<cols; j++)
				{
					//if(reader.getCellData("TestData", 0, i).equals("Y"))
					table.put(reader.getCellData("TestData", rowfound, i), reader.getCellData("TestData", j+1, i+1));
						System.out.print("\t"+reader.getCellData("TestData", j, i));
				}
				System.out.println();
				data[index][0]= table;
				index++;
			
	}
		
	}
  
}
