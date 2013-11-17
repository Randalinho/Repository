package de.hdm.itprojekt.shared.bo;

public class Zeitslot extends BusinessObjekt {
	
	/**
	 * Bezeichnung des Wochentags
	 */
	private String wochentag;
	
	/**
	 * Anfangsuhrzeit 
	 */
	private String anfangszeit;
	
	/**
	 * Enduhrzeit
	 */
	private String endzeit;
	
	public Zeitslot(String wochentag, String anfangszeit, String endzeit){
		this.wochentag = wochentag;
		this.anfangszeit = anfangszeit;
		this.endzeit = endzeit;
	}
	
	public void setWochentag(String wochentag){
		this.wochentag = wochentag;
	}
	
	public void setAnfangszeit(String anfangszeit){
		this.anfangszeit = anfangszeit;
	}
	
	public void setEndzeit(String endzeit){
		this.endzeit = endzeit;
	}
	
	public String getWochentag(){
		return this.wochentag;
	}
	
	public String getAnfangszeit(){
		return this.anfangszeit;
	}
	
	public String getEndzeit(){
		return this.endzeit;
	}
	
	Zeitslot montag1 = new Zeitslot ("Montag", "8:15", "9:45");
	Zeitslot montag2 = new Zeitslot ("Montag", "10:00", "11:30");
	Zeitslot montag3 = new Zeitslot ("Montag", "11:45", "13:15");
	Zeitslot montag4 = new Zeitslot ("Montag", "14:15", "15:45");
	Zeitslot montag5 = new Zeitslot ("Montag", "16:00", "17:30");
	Zeitslot montag6 = new Zeitslot ("Montag", "17:45", "19:15");
	
	Zeitslot dienstag1 = new Zeitslot ("Dienstag", "8:15", "9:45");
	Zeitslot dienstag2 = new Zeitslot ("Dienstag", "10:00", "11:30");
	Zeitslot dienstag3 = new Zeitslot ("Dienstag", "11:45", "13:15");
	Zeitslot dienstag4 = new Zeitslot ("Dienstag", "14:15", "15:45");
	Zeitslot dienstag5 = new Zeitslot ("Dienstag", "16:00", "17:30");
	Zeitslot dienstag6 = new Zeitslot ("Dienstag", "17:45", "19:15");
	
	Zeitslot mittwoch1 = new Zeitslot ("Mittwoch", "8:15", "9:45");
	Zeitslot mittwoch2 = new Zeitslot ("Mittwoch", "10:00", "11:30");
	Zeitslot mittwoch3 = new Zeitslot ("Mittwoch", "11:45", "13:15");
	Zeitslot mittwoch4 = new Zeitslot ("Mittwoch", "14:15", "15:45");
	Zeitslot mittwoch5 = new Zeitslot ("Mittwoch", "16:00", "17:30");
	Zeitslot mittwoch6 = new Zeitslot ("Mittwoch", "17:45", "19:15");
	
	Zeitslot donnerstag1 = new Zeitslot ("Donnerstag", "8:15", "9:45");
	Zeitslot donnerstag2 = new Zeitslot ("Donnerstag", "10:00", "11:30");
	Zeitslot donnerstag3 = new Zeitslot ("Donnerstag", "11:45", "13:15");
	Zeitslot donnerstag4 = new Zeitslot ("Donnerstag", "14:15", "15:45");
	Zeitslot donnerstag5 = new Zeitslot ("Donnerstag", "16:00", "17:30");
	Zeitslot donnerstag6 = new Zeitslot ("Donnerstag", "17:45", "19:15");
	
	Zeitslot freitag1 = new Zeitslot ("Freitag", "8:15", "9:45");
	Zeitslot freitag2 = new Zeitslot ("Freitag", "10:00", "11:30");
	Zeitslot freitag3 = new Zeitslot ("Freitag", "11:45", "13:15");
	Zeitslot freitag4 = new Zeitslot ("Freitag", "14:15", "15:45");
	Zeitslot freitag5 = new Zeitslot ("Freitag", "16:00", "17:30");
	Zeitslot freitag6 = new Zeitslot ("Freitag", "17:45", "19:15");
	
	@Override
	public String toString(){
		return this.wochentag+" "+this.anfangszeit+" - "+this.endzeit;
	}
}

