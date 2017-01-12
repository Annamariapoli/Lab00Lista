package it.polito.tdp.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model implements Comparable <String>{              
	
	private String parola;
	private List<String> listaParoleUtente = new ArrayList<String>();
	
	
	public List<String > getAggiungi(String s){
		if(!listaParoleUtente.contains(s)){
			listaParoleUtente.add(s);
		}
		return listaParoleUtente;
	}

	
	public List<String> getListaOrdinata(List<String> listaParolaUtente){    
		Collections.sort(listaParoleUtente);
		//System.out.println(listaParoleUtente);
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
	
//	public static void main(String [] args){
//		Model m = new Model();	
//		String s1 = "abaco";
//		String s2= "root";
//		String s3 = "roma";
//		String s4 = "bari";
//		String s5 = "ancona";
//		String s6 = "live";
//		String s7 = "ancona";
//		m.addParola(s1);
//		m.stampa();
//		m.addParola(s2);
//		m.addParola(s3);
//		m.addParola(s4);
//		m.addParola(s5);
//		m.addParola(s6);
//		m.addParola(s7);
//		m.stampa();
//		m.getElenco();
//		//m.reset();
//		//m.stampa();	
//	}


	@Override
	public int compareTo(String p) {
		return this.parola.compareTo(p);
	}
}
