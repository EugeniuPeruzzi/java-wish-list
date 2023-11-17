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
			// domande rivolte al utente
			System.out.println("A che regalo stai pensando?");
			String giftName = in.nextLine();
			System.out.println("A chi sara rivolto questo regalo?");
			String recipientName = in.nextLine();
			
			// creo una nuovo oggetto
			Gift giftObj = new Gift(giftName, recipientName);
			
			//aggiungo gli oggetti dentro alla lista
			gifts.add(giftObj);
			
			//stampiamo gli oggetti inseriti
			System.out.println("\n____________________________\n" + "Fino ad ora hai inserito: " + gifts.size() + " regalo" + "\n____________________________\n");
			// qua se l'utente scrive qualcosa diverso da si usciamo dal ciclo
			System.out.println("Vuoi inserire altri oggetti? Si/No");
			loopKey = in.nextLine(); 
		}
		while(loopKey.equalsIgnoreCase("si"));
		
		in.close();
	}

}
