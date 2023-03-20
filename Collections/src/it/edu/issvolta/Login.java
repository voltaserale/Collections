package it.edu.issvolta;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		//creo un lista di utenti
		ArrayList<Utente> elencoUtenti=new ArrayList<Utente>();
		
		//aggiungo gli utenti
		elencoUtenti.add(new Utente(1,"mrossi","mr123","Mario","Rossi"));
		elencoUtenti.add(new Utente(2,"fverdi","fv456","Franco","Verdi"));
		elencoUtenti.add(new Utente(3,"pgialli","pg789","Pino","Gialli"));
		elencoUtenti.add(new Utente(4,"eblu","eb635","Elena","Blu"));
		elencoUtenti.add(new Utente(5,"amarro","am1535","Alessandra","Marroni"));
		
		Scanner s=new Scanner(System.in);
		String userName, password;
		System.out.print("Inserisci il tuo username: ");
		userName=s.nextLine();
		System.out.print("Inserisci la tua password: ");
		password=s.nextLine();
		
		boolean Trovato=false;	
		for(Utente u:elencoUtenti) {
			if (u.getUsername().equals(userName) &&
				u.getPassword().equals(password)) {
				Trovato=true;	//ho trovato l'utente!
				//mostro il messaggio di benvenuto
				System.out.println("Benvenuto "+u.getNome()+" "+u.getCognome());
			}						
		}
		if(!Trovato)			// if (Trovato==false)
			System.out.println("Utente non riconosciuto!");
		
		s.close();
		
		
	}

}
