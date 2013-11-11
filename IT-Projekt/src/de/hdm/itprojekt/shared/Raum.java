package de.hdm.itprojekt.shared;

public class Raum {
	/**
	 * ID des Raumes
	 */
		private int raumId;
		
	/**
	 * Bezeichnung des Raumes
	 */
		private String name;
		
	/**
	 * Kapazität des Raumes;
	 */
		private int kapazitaet;

	public int getRaumId() {
		return raumId;
	}

	public void setRaumId(int raumId) {
		this.raumId = raumId;
	}

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
