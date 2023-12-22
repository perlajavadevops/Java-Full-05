package com;

public class PackageClassDemo {
	
	public static void main(String[] args) {
		Package pack = Package.getPackage("java.lang");
		System.out.println(pack.getName());
		//System.out.println(pack.);
		
	}

}
