package com.google;

import com.pgr.PublicDemo;

public class PublicDemoSamePackage {

	public static void main(String[] args) {
		PublicDemo demo = new PublicDemo();
		demo.m();
		System.out.println(demo.sno);
	}
	
}
