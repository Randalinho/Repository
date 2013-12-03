package de.hdm.itprojekt.shared;



import java.util.Date;

import com.google.gwt.user.client.rpc.RemoteService;

import de.hdm.itprojekt.shared.bo.*;

public interface Verwaltungsklasse extends RemoteService {
	
	public void init() throws IllegalArgumentException;
	
	public Studiengang createStudiengang(String bezeichnung)
			throws IllegalArgumentException;
	
	public Stundenplaneintrag createStundenplaneintrag(Dozent d, Lehrveranstaltung l, Raum r, 
			Zeitslot z, Semesterverband sv)
					throws IllegalArgumentException;
	
	public Dozent createDozent(String vorname, String nachname, String email)
		throws IllegalArgumentException;
	
	public Zeitslot createZeitslot(Date wochentag, Date anfangszeit, Date endzeit)
			throws IllegalArgumentException;
	
	public Lehrveranstaltung createLehrveranstaltung(String bezeichnung, int semester, int umfang)
			throws IllegalArgumentException;
	
	public Raum createRaum(String bezeichnung, int kapazitaet)
			throws IllegalArgumentException;
	
	public Semesterverband createSemesterverband(Studiengang bezeichnung, int semester, int studierendenAnzahl, String jahrgang)
			throws IllegalArgumentException;
	
	public Zeitslot deleteZeitslot(Zeitslot z)
			throws IllegalArgumentException;
	
	public Studiengang deleteStudiengang(Studiengang sg)
			throws IllegalArgumentException;
	
	public Stundenplaneintrag deleteStundenplaneintrag(Stundenplaneintrag s)
			throws IllegalArgumentException;
	
	public Dozent deleteDozent(Dozent d) 
			throws IllegalArgumentException;
	
	public Lehrveranstaltung deleteLehrveranstaltung(Lehrveranstaltung l) 
			throws IllegalArgumentException;
	
	public Raum deleteRaum(Raum r) 
			throws IllegalArgumentException;
	
	public Semesterverband deleteSemesterverband(Semesterverband sv) 
			throws IllegalArgumentException;
	
	public Studiengang changeStudiengang(String bezeichnung)
			throws IllegalArgumentException;
	
	public Zeitslot changeZeitslot(Date wochentag, Date anfangszeit, Date endzeit)
			throws IllegalArgumentException;
	
	public Stundenplaneintrag changeStundenplaneintrag(Stundenplaneintrag s)
			throws IllegalArgumentException;
	
	public Dozent changeDozent(Dozent d)
			throws IllegalArgumentException;
	
	public Lehrveranstaltung changeLehrveranstaltung(Lehrveranstaltung l)
			throws IllegalArgumentException;
	
	public Raum changeRaum(Raum r)
			throws IllegalArgumentException;
	
	public Semesterverband changeSemsterverband(Semesterverband sv)
			throws IllegalArgumentException;
}

