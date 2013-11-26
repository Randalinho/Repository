package de.hdm.itprojekt.shared.bo;

import java.util.Date;

public class Zeitslot extends BusinessObjekt {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Bezeichnung des Wochentags
	 */
	private Date wochentag;
	
	/**
	 * Anfangsuhrzeit 
	 */
	private Date anfangszeit;
	
	/**
	 * Enduhrzeit
	 */
	private Date endzeit;
	
	public Zeitslot(){
	}

	public Date getWochentag() {
		return wochentag;
	}

	public void setWochentag(Date wochentag) {
		this.wochentag = wochentag;
	}

	public Date getAnfangszeit() {
		return anfangszeit;
	}

	public void setAnfangszeit(Date anfangszeit) {
		this.anfangszeit = anfangszeit;
	}

	public Date getEndzeit() {
		return endzeit;
	}

	public void setEndzeit(Date endzeit) {
		this.endzeit = endzeit;
	}
	
	
}

