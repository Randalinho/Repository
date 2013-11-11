package de.hdm.itprojekt.shared;

public class Lehrveranstaltung extends BusinessObjekt{
	
	/**
	 * Bezeichnung der Lehrveranstaltung
	 */
		private String bezeichnung;
		
	/**
	 * EDV Nummer der Lehrveranstaltung
	 */
		private String edvNummer;
		
	/**
	 * ECTS-Anzahl der Lehrveranstaltung
	 */
		private int ects;
		
	/**
	 * SWS der Lehrveranstaltung
	 */
		private int sws;
	
	public void setBezeichnung(String bezeichnung){
		this.bezeichnung = bezeichnung;
	}
	
	public void setEdvNummer(String edvNummer){
		this.edvNummer = edvNummer;
	}
	
	public void setSemester(int sws){
		this.sws = sws;
	}
	
	public void setUmfang(int ects){
		this.ects = umfang;
	}
	
	public String getBezeichnung(){
		return this.bezeichnung;
	}
	
	public String getEdvNummer(){
		return this.edvNummer;
	}

	public int getSemester(){
		return this.sws;
	}
	
	public int getUmfang(){
		return this.ects;
	}
	
	@Override
	public String toString(){
		return this.edvNummer+" "+this.bezeichnung;
	}
}
