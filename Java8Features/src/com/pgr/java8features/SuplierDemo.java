package com.pgr.java8features;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SuplierDemo {

	public static void main(String[] args) {
		Supplier<LocalDateTime> s = () -> LocalDateTime.now();
		System.out.println(s.get());
	}
}


//Oracle or MySQL --> SQL