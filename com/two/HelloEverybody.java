package com.two;

import com.five.Name;

public class HelloEverybody{
	public static void main(String[] args) {
		Name myName = new Name("Sendra", "Malala");
		System.out.println(myName.getName());
		System.out.println(myName.getLastName());
	}
}