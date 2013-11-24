package de.hdm.itprojekt.shared;

import com.google.gwt.user.client.rpc.RemoteService;

import de.hdm.itprojekt.shared.bo.*;

public interface Verwaltungsklasse extends RemoteService {
	
	public void init() throws IllegalArgumentException;
	
	public Dozent createDozent(String vorname, String nachname, String email)
		throws IllegalArgumentException;
	
	public Lehrveranstaltung createLehrveranstaltung(String bezeichnung, int semester, int umfang)
			throws IllegalArgumentException;
	
	public Raum createRaum(String name, int kapazitaet)
			throws IllegalArgumentException;
	
	public Semesterverband createSemesterverband(String studiengang, int semester, int studierendenAnzahl)
			throws IllegalArgumentException;
	
	public Dozent deleteDozent(Dozent a) throws IllegalArgumentException;
	
	public Lehrveranstaltung deleteLehrveranstaltung(Lehrveranstaltung a) throws IllegalArgumentException;
	
	public Raum deleteRaum(Raum a) throws IllegalArgumentException;
	
	public Semesterverband deleteSemesterverband(Semesterverband a) throws IllegalArgumentException;
	
	public Dozent changeDozent(String vorname, String nachname, String email)
			throws IllegalArgumentException;
	
	public Lehrveranstaltung changeLehrveranstaltung(String bezeichnung, int semester, int umfang)
			throws IllegalArgumentException;
	
	public Raum changeRaum(String name, int kapazitaet)
			throws IllegalArgumentException;
	
	public Semesterverband changeSemsterverband(String studiengang, int semester, int studierendenAnzahl)
			throws IllegalArgumentException;
}

