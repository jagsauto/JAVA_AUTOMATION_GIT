package com.qtpselenium.util;

public class singleton_demo_street {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// singleton_demo_house h = new singleton_demo_house();

		singleton_demo_house.getinst();
		singleton_demo_house h1 = singleton_demo_house.getinst();
		singleton_demo_house h2 = singleton_demo_house.getinst();

		h1.city = "delhi";
		System.out.println(h1.city);
		System.out.println(h2.city);

	}

}
