package entity;

import java.util.ArrayList;

public class Piazzola {
	
	private int idPiazzola;
	private int codiceSettore;
	private String statoPiazzola;
	
	
	//COSTRUTTORE
	public Piazzola (int piaz, int settore, String stato) {
		this.idPiazzola = piaz;
		this.codiceSettore = settore;
		this.statoPiazzola = stato;
	}
	
	
	//GET E SET
	
	public int getIdPiazzola() {
		return idPiazzola;
	}
	
	public void setIdPiazzola(int idPiazzola) {
		this.idPiazzola = idPiazzola;
	}

	public ArrayList<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(ArrayList<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	
	
	
	
	//trigger per controllsre disponibilità piazzola per prenotazione
	

}
