package org.lessons.java.numbers;

public class Main {
	public static void main(String[] args) {
		
		int[] numberArray = {1, 5, 6, 7, 9};
		Number numbers = new Number (numberArray) ;
		
		while (numbers.hasElements()) {
			System.out.println(numbers.getNextElement());
		}
		System.out.println("-------------------");
		Number numbers2 = new Number();
		numbers2.addElement(5);
		numbers2.addElement(9);
		numbers2.addElement(3);
		
		while (numbers2.hasElements()) {
			System.out.println(numbers2.getNextElement());
		}
	}
}
