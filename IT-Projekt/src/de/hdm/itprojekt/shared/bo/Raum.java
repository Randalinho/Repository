package de.hdm.itprojekt.shared.bo;

public class Raum extends BusinessObjekt {
		
	/**
	 * Bezeichnung des Raumes
	 */
		private String name;
		
	/**
	 * Kapazit?t des Raumes;
	 */
		private int kapazitaet;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKapazitaet() {
		return kapazitaet;
	}

	public void setKapazitaet(int kapazitaet) {
		this.kapazitaet = kapazitaet;
	}
	
	
	
}
