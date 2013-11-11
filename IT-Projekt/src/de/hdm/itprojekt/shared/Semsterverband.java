package de.hdm.itprojekt.shared;

public class Semsterverband extends BusinessObjekt {
	
	private String studiengang;
	private int semester;
	private int studierendenAnzahl;
	private String erstsemester;
	
	public void setStudiengang(String studiengang){
		this.studiengang = studiengang;
	}
	
	public void setSemester(int semester){
		this.semester = semester;
	}
	
	public void setStudierendenAnzahl(int studierendenAnzahl){
		this.studierendenAnzahl = studierendenAnzahl;
	}
	
	public void setJahrgang(String erstsemester){
		this.erstsemester = erstsemester;
	}
	
	public String getStudiengang(){
		return this.studiengang;
	}
	
	public int getSemester(){
		return this.semester;
	}
	
	public int getStudierendenAnzahl(){
		return this.studierendenAnzahl;
	}
	
	public String getErstsemester(){
		return this.erstsemester;
	}
	
	public String toString(){
		return semester +". Semester "+this.studiengang;
	}
	
}
