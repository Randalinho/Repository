package de.hdm.itprojekt.shared;

public class Lehrveranstaltung extends BusinessObjekt{
	
	private String bezeichnung;
	private String edvNummer;
	private int semester;
	private int umfang;
	
	public void setBezeichnung(String bezeichnung){
		this.bezeichnung = bezeichnung;
	}
	
	public void setEdvNummer(String edvNummer){
		this.edvNummer = edvNummer;
	}
	
	public void setSemester(int semester){
		this.semester = semester;
	}
	
	public void setUmfang(int umfang){
		this.umfang = umfang;
	}
	
	public String getBezeichnung(){
		return this.bezeichnung;
	}
	
	public String getEdvNummer(){
		return this.edvNummer;
	}

	public int getSemester(){
		return this.semester;
	}
	
	public int getUmfang(){
		return this.umfang;
	}
	
	@Override
	public String toString(){
		return this.edvNummer+" "+this.bezeichnung;
	}
}
