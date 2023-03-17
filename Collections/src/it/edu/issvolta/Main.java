package it.edu.issvolta;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {	
		//variabili singole
		Utente u1=new Utente(1, "mrossi", "12345", "Mario", "Rossi");
		Utente u2=new Utente(2, "fverdi", "92134", "Franco", "Verdi");
		Utente u3=new Utente(3, "ggialli", "41245", "Gino", "Gialli");
		
		//array di utenti		
		Utente[] elencoUtenti=new Utente[3];
		elencoUtenti[0]=new Utente(1, "mrossi", "12345", "Mario", "Rossi");
		elencoUtenti[1]=new Utente(2, "fverdi", "92134", "Franco", "Verdi");
		elencoUtenti[2]=new Utente(3, "ggialli", "41245", "Gino", "Gialli");
		
		//Oppure (per inizializzare già il vettore):
		//Utente[] elencoUtenti={
		//	new Utente(1, "mrossi", "12345", "Mario", "Rossi"),
		//	new Utente(2, "fverdi", "92134", "Franco", "Verdi"),
		//	new Utente(3, "ggialli", "41245", "Gino", "Gialli")
		//	};
		
		
		/*
		//oppure (se ho già creato gli oggetti):
		elencoUtenti[0]=u1;
		elencoUtenti[1]=u2;
		elencoUtenti[2]=u3;
		*/
		
		
		System.out.println("Vettore utenti (ciclo for)");
		//visualizzo gli utenti (ogni elencoUtenti[i] è un oggetto di tipo Utente)
		for (int i=0;i<3;i++)
			System.out.println(
				"Utente "+ elencoUtenti[i].getId()+": "+
				elencoUtenti[i].getNome()+" "+elencoUtenti[i].getCognome());
		
		
		System.out.println("\nVettore utenti (ciclo for each)");
		//metodo alternativo: for each (la variabile u assume il valore di ogni utente del vettore)
		for (Utente u: elencoUtenti)	//per ogni utente in elencoUtenti
			System.out.println(
				"Utente "+ u.getId()+": "+
				u.getNome()+" "+u.getCognome());
		
		
		//ArrayList (lista dinamica)
		ArrayList<Utente> listaUtenti = new ArrayList<>();  //oppure =new ArrayList<Utente>();   
		listaUtenti.add(u1);
		listaUtenti.add(u2);
		listaUtenti.add(u3);
				
		//oppure:
		listaUtenti.add(new Utente(4, "lmarron", "43234", "Lino", "Marroni"));
		
		
		//in questo caso per prendere l'elemento in posizione i bisogna usare la sintassi .get(i)
		System.out.println("\nLista utenti (ciclo for)");
		for(int i=0;i<listaUtenti.size();i++)
			System.out.println(
				"Utente "+ listaUtenti.get(i).getId()+": "+
					listaUtenti.get(i).getNome()+" "+listaUtenti.get(i).getCognome());
		
		
		//elimino l'elemento in posizione 2
		listaUtenti.remove(2);
		
		System.out.println("\nLista utenti (ciclo for each)");
		for(Utente u: listaUtenti)
			System.out.println(
				"Utente "+ u.getId()+": "+
					u.getNome()+" "+u.getCognome());
	}

}
