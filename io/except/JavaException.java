package io.except;

public class JavaException{
	public static void main(String[] args) {
		int j = 20, i = 0;
		try{
            System.out.println(j/i);
		}catch(ArithmeticException e){
            System.out.println("That is an error from you!! Sorry for the interuption!!!");
		}
		System.out.println("Hey!!! How are you!!!!");
	}
}