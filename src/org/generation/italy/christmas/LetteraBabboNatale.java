package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.IllegalFormatPrecisionException;

public class LetteraBabboNatale {
	
	private String nome, indirizzo;
	private ArrayList<String> listaDesideri = new ArrayList<String>();
	public LetteraBabboNatale(String nome, String indirizzo, ArrayList<String> listaDesideri) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.listaDesideri = listaDesideri;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public ArrayList<String> getListaDesideri() {
		return listaDesideri;
	}
	public void setListaDesideri(ArrayList<String> listaDesideri) {
		this.listaDesideri = listaDesideri;
	}
	
	public String invia() throws Exception{
		if(listaDesideri.size() > 5) {
			throw new Exception("Errore: lunghezza massima di 5 desideri superata.\nInvio non riuscito.");
		}else {
			return "Recap informazioni: " + "\nNome: " + nome + "\nIndirizzo: " + indirizzo + "\nLista dei Desideri: " + listaDesideri +"\nLista inviata con successo!";
		}
		
	}

	
	
	
	

}
