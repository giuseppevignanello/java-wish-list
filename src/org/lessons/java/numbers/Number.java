package org.lessons.java.numbers;

public class Number {
	
	private int[] numbersArray;
	int numberInvocations = 0; 

	public Number () {
		this.numbersArray = new int[0]; 
	}
	public Number(int[] numbersArray) {
		setNumbersArray(numbersArray);
	}
	
	int[] addElement (int newNumber) {
		int[] newNumbersArray = new int[numbersArray.length +1];
		
		for (int i = 0; i < numbersArray.length; i++) {
			newNumbersArray[i] = numbersArray[i];
		}	
			newNumbersArray[numbersArray.length] = newNumber;
			
			numbersArray = newNumbersArray;
		
		return numbersArray;
	}
	
	int getNextElement() {
		numberInvocations ++;
		return numbersArray[numberInvocations - 1];
	}
	
	boolean hasElements() {
		if(numbersArray.length > numberInvocations) {
			return true;
		} else {
			return false;
		}
		
	}
	public int[] getNumbersArray() {
		return numbersArray;
	}
	public void setNumbersArray(int[] numbersArray) {
		this.numbersArray = numbersArray;
	}
}
