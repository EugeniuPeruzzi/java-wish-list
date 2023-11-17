package org.lessons.java.christmas;

import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<Gift> gifts = new ArrayList<>();
		String loopKey = "";
		
		//Un ciclo do while fin che l'utenta dice se lui prosegue, se dice no o altro il ciclo si ferma e stampo a schermo i dati inseriti.
		do {
			System.out.println("A che regalo stai pensando?");
			
		}
		while(loopKey.equalsIgnoreCase("si"));
	}

}
