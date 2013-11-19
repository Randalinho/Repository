package de.hdm.itprojekt.shared.bo;

public class Semesterverband extends BusinessObjekt {
	
	/**
	 * Name des Studiengangs
	 */
	private String studiengang;
	
	/**
	 * Semesterstufe
	 */
	private int semester;
	
	/**
	 * Anzahl der Studierenden
	 */
	private int studierendenAnzahl;
	
	/**
	 * Semesterjahrgang des Erstsemsters
	 */
	private String jahrgang;
	
	public String getStudiengang() {
		return studiengang;
	}

	public void setStudiengang(String studiengang) {
		this.studiengang = studiengang;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getStudierendenAnzahl() {
		return studierendenAnzahl;
	}

	public void setStudierendenAnzahl(int studierendenAnzahl) {
		this.studierendenAnzahl = studierendenAnzahl;
	}

	public String getJahrgang() {
		return jahrgang;
	}

	public void setJahrgang(String jahrgang) {
		this.jahrgang = jahrgang;
	}

	public String toString(){
		return semester +". Semester "+this.studiengang;
	}
	
}
