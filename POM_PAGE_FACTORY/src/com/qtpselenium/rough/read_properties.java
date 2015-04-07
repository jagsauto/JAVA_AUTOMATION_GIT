package com.qtpselenium.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class read_properties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream fn = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\com\\qtpselenium\\config\\OR.properties");
		prop.load(fn);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("location"));
		System.out.println(prop.getProperty("year"));
		System.out.println(prop.getProperty("town"));

	}

}
