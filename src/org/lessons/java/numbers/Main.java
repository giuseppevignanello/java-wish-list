package org.lessons.java.numbers;

public class Main {
	public static void main(String[] args) {
		
		int[] numberArray = {1, 5, 6, 7};
		Number numbers = new Number (numberArray) ;
		
		System.out.println(numbers.getNextElement());
		System.out.println(numbers.getNextElement());
		System.out.println(numbers.getNextElement());
		System.out.println(numbers.getNextElement());
	}
}