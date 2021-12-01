package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		ArrayList<String> desideri = new ArrayList<String>();
		boolean continuare = false;
		String quantita = "desiderio";
		
		do{
			System.out.print("Aggiungi elemento alla lista dei desideri: ");
			desideri.add(input.nextLine());
			if(!continuare) {
				quantita = "desiderio";
			}else {
				quantita = "desideri";
			}
			System.out.println("La tua lista continiene: " + desideri.size() + " " + quantita);
			continuare = false;
			System.out.print("Continuare? (s/n)");
			if(input.nextLine().contentEquals("s")) {
				continuare = true;
			}
		}while (continuare == true);
		
		System.out.println("Ecco la tua lista: ");
		Iterator<String> iterator = desideri.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		Collections.sort(desideri);
		System.out.println("Inserire nome: ");
		String nome = input.nextLine();
		System.out.println("Inserire indirizzo: ");
		String indirizzo = input.nextLine();
		
		LetteraBabboNatale lettera = new LetteraBabboNatale(nome, indirizzo, desideri);
		
		try {
			 System.out.println(lettera.invia());	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		input.close();
	
	}
}

