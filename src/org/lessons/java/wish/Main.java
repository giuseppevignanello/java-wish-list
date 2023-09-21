package org.lessons.java.wish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	List<String> wishList = new ArrayList<>();

	boolean stop = false;
	Scanner sc = new Scanner(System.in);
	while(!stop)
	{
		
		System.out.println("Insert a gift name. Insert 'stop' to stop");
		
		String gift = sc.nextLine();
		if (gift.equals("stop")) {
			stop = true;
		} else {
			wishList.add(gift);
			System.out.println("You have " + wishList.size() + " gifts" );
		}
		
		
			
	}
	System.out.println(wishList);
	sc.close();
	
}

}
