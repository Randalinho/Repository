package de.hdm.itprojekt.shared.bo;

public class Dozent extends BusinessObjekt {
	
/**
 * Vorname des Dozenten
 */
	private String vorname;
	
/**
 * Nachname des Dozenten
 */
	private String nachname;
	
/**
 * E-Mail Adresse des Dozenten
 */
	private String email;

public String getVorname() {
	return vorname;
}

public void setVorname(String vorname) {
	this.vorname = vorname;
}

public String getNachname() {
	return nachname;
}

public void setNachname(String nachname) {
	this.nachname = nachname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
	
	
}
