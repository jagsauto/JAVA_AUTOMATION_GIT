package com.qtpselenium.util;

public class singleton_demo_house {

	public static singleton_demo_house obj;
	public static String city;

	private singleton_demo_house() {
		System.out.println("in construtor");
	}

	public static singleton_demo_house getinst() {
		if (obj == null) {
			obj = new singleton_demo_house();
			return obj;
		} else
			return obj;
	}
}
