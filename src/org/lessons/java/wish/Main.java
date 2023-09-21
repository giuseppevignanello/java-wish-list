package org.lessons.java.wish;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	//List<String> wishList = new ArrayList<>();
	Map<String, String> wishList = new HashMap<>();
	
	boolean stop = false;
	Scanner sc = new Scanner(System.in);
	System.out.println("WISH LIST: (insert 'stop' to end)");
	while(!stop)
	{
		System.out.println("Who’s the gift for?");
		
		String receiving = sc.nextLine();
		System.out.println("Add a gift");
		String gift = sc.nextLine();
		
		if(receiving.equals("stop")|| gift.equals("stop")) {
			stop = true;
		} else {
			wishList.put(receiving, gift);
			System.out.println("You have " + wishList.size() + " gifts");
		}
//		System.out.println("Insert a gift name. Insert 'stop' to stop");
//		
//		String gift = sc.nextLine();
//		if (gift.equals("stop")) {
//			stop = true;
//		} else {
//			wishList.add(gift);
//			System.out.println("You have " + wishList.size() + " gifts" );
//		}
//		
		
	}
	System.out.println(wishList);
	sc.close();
	
}

}
