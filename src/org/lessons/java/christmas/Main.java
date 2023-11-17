package org.lessons.java.christmas;

import java.util.*;

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
		
		
		System.out.println("come vuoi filtrare la tua ricerca?");
		System.out.println("1 = Filtro per nome / 2 = Filtra per regalo");
		int filterChoice = in.nextInt();
		if(filterChoice == 1) {
			// sto dicendo "Ordina la lista di regali in base al nome del regalo";
			//Collections.sort(gifts,Comparator.comparing(gift -> gift.getName()));
			gifts.sort(Comparator.comparing(gift -> gift.getName()));
		}
		else {
			gifts.sort(Comparator.comparing(gift -> gift.getRecipient()));
		}
		
		// stampiamo tutta la lista al termine del ciclo usando la versione enhanced di for;
		System.out.println("La tua lista e: " + "\n ______________________\n");
		
		for (Gift gift : gifts) {
			System.out.println(gift);
		}
		
		
		in.close();
	}

}
