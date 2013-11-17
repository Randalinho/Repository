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
	
	@Override
	public String toString(){
		return this.wochentag+" "+this.anfangszeit+" - "+this.endzeit;
	}
}

