package it.polito.tdp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Model implements Comparable <String>{              
	
	private String parola;
	private List<String> listaParoleUtente = new ArrayList<String>();
	
	public void addParola(String p){            //funziona
		if(!listaParoleUtente.contains(p)){
			listaParoleUtente.add(p);
		}		
		
	}
	
	public void stampa(){
		System.out.println(listaParoleUtente.toString());
	}
	
	public List<String> getElenco(){     //ok
		//ordine alfa  //funziona
		//listaParoleUtente.sort();
		Collections.sort(listaParoleUtente);
		System.out.println(listaParoleUtente);
		return listaParoleUtente ;
	}

	
	public void reset(){                                      //funziona
		listaParoleUtente.removeAll(listaParoleUtente);
	}

/*	@Override
	public int compareTo(Model o) {               //NN FUNZIONA //SE METTESSI STRING??
		return this.parola.compareTo(o.parola);
	}
	*/
	
	public static void main(String [] args){
		Model m = new Model();	
		String s1 = "abaco";
		String s2= "root";
		String s3 = "roma";
		String s4 = "bari";
		String s5 = "ancona";
		String s6 = "live";
		String s7 = "ancona";
		m.addParola(s1);
		m.stampa();
		m.addParola(s2);
		m.addParola(s3);
		m.addParola(s4);
		m.addParola(s5);
		m.addParola(s6);
		m.addParola(s7);
		
		m.stampa();
		
		m.getElenco();
		//m.reset();
		//m.stampa();
		
	}

	/*@Override
	public int compare(String p1, String p2) {
		
		return p1.compareTo(p2);
	}*/

	@Override
	public int compareTo(String p) {
		return this.parola.compareTo(p);
	}

	
	
}
