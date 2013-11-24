package de.hdm.itprojekt.shared;

import com.google.gwt.user.client.rpc.RemoteService;

import de.hdm.itprojekt.shared.bo.*;

public interface Verwaltungsklasse extends RemoteService {
	
	public Dozent createDozent(String vorname, String nachname, String email)
		throws IllegalArgumentException;
	
	public Lehrveranstaltung createLehrveranstaltung(String bezeichnung, int semester, int umfang)
			throws IllegalArgumentException;
	
	public Raum createRaum(String name, int kapazitaet)
			throws IllegalArgumentException;
	
	public Semesterverband createSemesterverband(String studiengang, int semester, int studierendenAnzahl)
			throws IllegalArgumentException;
	
}
