package com.two;

import com.four.HelloManovosoa;
import com.one.HelloAndriantsihoarana;
import com.three.HelloManovo;

public class HelloEverybody{
	public static void main(String[] args) {
		HelloManovo helloNovo = new HelloManovo();
		HelloAndriantsihoarana helloTsihoarana = new HelloAndriantsihoarana();
		HelloManovosoa helloSoa = new HelloManovosoa();

		System.out.println(helloSoa());
		System.out.println(helloNovo());
		System.out.println(helloTsihoarana());
	}
}