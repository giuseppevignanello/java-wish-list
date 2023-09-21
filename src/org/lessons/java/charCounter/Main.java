package org.lessons.java.charCounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> charCounter = new HashMap<>();

		boolean stop = false;

		while (!stop) {
			System.out.println("Insert a string and count the char occourences (insert 'stop' to stop)");
			String userString = sc.nextLine();

			if (userString.equals("stop")) {
				stop = true;
			} else {
				for (int i = 0; i < userString.length(); i++) {
					char userStringChar = userString.charAt(i);
					if (charCounter.containsKey(userStringChar)) {
						charCounter.put(userStringChar, charCounter.get(userStringChar) + 1);
					} else {
						charCounter.put(userStringChar, 1);
					}

				}
				
				//with lambda functions 
				charCounter.forEach((k, v) -> {
					System.out.println(k + ":" + v);
				});
				
//				for(Character k : charCounter.keySet()) {
//					Integer v = charCounter.get(k);
//					System.out.println(k + ": " + v);
//				}
				
				charCounter.clear();

			}
			
		}
		System.out.println("STOPPED");
	}
}
