package de.hdm.itprojekt.shared.bo;

public class Raum extends BusinessObjekt {
		
	/**
	 * Bezeichnung des Raumes
	 */
		private String bezeichung;
		
	/**
	 * Kapazit?t des Raumes;
	 */
		private int kapazitaet;

	public String getBezeichnung() {
		return bezeichung;
	}

	public void setBezeichnung(String name) {
		this.bezeichung = name;
	}

	public int getKapazitaet() {
		return kapazitaet;
	}

	public void setKapazitaet(int kapazitaet) {
		this.kapazitaet = kapazitaet;
	}
	
	
	
}
