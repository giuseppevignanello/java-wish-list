package org.lessons.java.numbers;

public class Number {
	
	private int[] numbersArray;
	int numberInvocations = 0; 

	public Number(int[] numbersArray) {
		setNumbersArray(numbersArray);
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
