package de.hdm.itprojekt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.hdm.itprojekt.shared.*;
import de.hdm.itprojekt.shared.bo.*;

public class VerwaltungsklasseImpl extends RemoteServiceServlet 
implements Verwaltungsklasse {
	
	@Override		
	public Dozent createDozent(String vorname, String nachname)
			throws IllegalArgumentException {
		Dozent a = new Dozent();
		a.setVorname(vorname);
		a.setNachname(nachname);
		
		a.setId(1);
		
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}
	
	@Override
	public Lehrveranstaltung createLehrveranstaltung(
			String bezeichnung, int semester, int umfang)
			throws IllegalArgumentException {
		Lehrveranstaltung a = new Lehrveranstaltung();
		a.setBezeichnung(bezeichnung);
		a.setSemester(semester);
		a.setUmfang(umfang);
		
		a.setId(1);
		
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}		
	
	@Override
	public Raum createRaum(String name, int kapazitaet)
			throws IllegalArgumentException {
		Raum a = new Raum();
		a.setName(name);
		a.setKapazitaet(kapazitaet);
		
		a.setId(1);
		
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}
	
	@Override
	public Semesterverband createSemesterverband(String studiengang,
			int semester, int studierendenAnzahl)
			throws IllegalArgumentException {
		Semesterverband a = new Semesterverband();
		a.setStudiengang(studiengang);
		a.setSemester(semester);
		a.setStudierendenAnzahl(studierendenAnzahl);
		
		a.setId(1);
		
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}

	
}
