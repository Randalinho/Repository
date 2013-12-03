package de.hdm.itprojekt.server;

import java.util.Date;
import java.util.Vector;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.hdm.itprojekt.server.db.StundenplaneintragMapper;
import de.hdm.itprojekt.shared.*;
import de.hdm.itprojekt.shared.bo.*;
import de.hdm.thies.bankProjekt.shared.bo.Account;
import de.hdm.thies.bankProjekt.shared.bo.Customer;

public class VerwaltungsklasseImpl extends RemoteServiceServlet 
implements Verwaltungsklasse {

	/**
	 * Standard StundenplaneintragID
	 */
	private static final long serialVersionUID = 7027992284251455305L;

	public Dozent createDozent(String vorname, String nachname, String email)
			throws IllegalArgumentException {
		Dozent a = new Dozent();
		a.setVorname(vorname);
		a.setNachname(nachname);
		a.setEmail(email);
		
		a.setId(1);
		
		//Dozentmapper.insert
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
		
		//lehrveranstaltungmapper.insert
		return null;
	}		
	
	@Override
	public Raum createRaum(String bezeichnung, int kapazitaet)
			throws IllegalArgumentException {
		Raum a = new Raum();
		a.setBezeichnung(bezeichnung);
		a.setKapazitaet(kapazitaet);
		
		a.setId(1);
		
		//Raummapper.insert
		return null;
	}
	
	public Semesterverband createSemesterverband(Studiengang bezeichnung,
			int semester, int studierendenAnzahl)
			throws IllegalArgumentException {
		Semesterverband a = new Semesterverband();
		a.setBezeichnung(bezeichnung);
		a.setSemester(semester);
		a.setStudierendenAnzahl(studierendenAnzahl);
		
		a.setId(1);
		
		//semesterverbandmapper.insert
		return null;
	}

	@Override
	public Studiengang createStudiengang(String bezeichnung)
			throws IllegalArgumentException {
		
		Studiengang s = new Studiengang();
		
		s.setBezeichnung(bezeichnung);
		
		s.setId(1);
		
		//studiengangmapper.insert
		return null;
	}

	@Override
	public Stundenplaneintrag createStundenplaneintrag(Dozent d,
			Lehrveranstaltung l, Raum r, Zeitslot z, Semesterverband sv) 
					throws IllegalArgumentException {
		
		Stundenplaneintrag s = new Stundenplaneintrag();
		
		s.setDozentId(d.getId());
		s.setLehrveranstaltungsId(l.getId());
		s.setRaumId(r.getId());
		s.setZeitslotId(z.getId());
		s.setSemesterverbandId(sv.getId());
		
		s.setId(1);
		
		//stundenplaneintragmapper.insert
		return null;
	}

	@Override
	public Zeitslot createZeitslot(Date wochentag, Date anfangszeit,
			Date endzeit) throws IllegalArgumentException {
		
		Zeitslot z = new Zeitslot();
		
		z.setWochentag(wochentag);
		z.setAnfangszeit(anfangszeit);
		z.setEndzeit(endzeit);
		
		z.setId(1);
		
		// Zeitslotmapper.insert
		return null;
	}

	@Override
	public Dozent deleteDozent(Dozent d) throws IllegalArgumentException {
		
		 Vector<Dozent> dozenten = this.getStundenplaneintragOf(d);

		    if (dozenten != null) {
		    	//Bildschirmmeldung: Dozent kann nicht geloescht werden, da noch Stundenplaneinträge
		    } else {
		    	this.delete(d);
		    }
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}
	
	 public Vector<Dozenten> getStundenplaneintragOf(Dozenten d)
		      throws IllegalArgumentException {
		    //return this.DozentenMapper.findByOwner(d);
		  }

	@Override
	public Lehrveranstaltung deleteLehrveranstaltung(Lehrveranstaltung a)
			throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}

	@Override
	public Zeitslot deleteZeitslot(Zeitslot z) throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}

	@Override
	public Studiengang deleteStudiengang(Studiengang studiengang)
			throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}

	@Override
	public Stundenplaneintrag deleteStundenplaneintrag(Stundenplaneintrag s)
			throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}

	@Override
	public Raum deleteRaum(Raum a) throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}

	@Override
	public Semesterverband deleteSemesterverband(Semesterverband a)
			throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}

	@Override
	public Dozent changeDozent(String vorname, String nachname, String email)
			throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}

	@Override
	public Lehrveranstaltung changeLehrveranstaltung(String bezeichnung,
			int semester, int umfang) throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}

	@Override
	public Raum changeRaum(String name, int kapazitaet)
			throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}

	@Override
	public Studiengang changeStudiengang(String bezeichnung)
			throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}

	@Override
	public Zeitslot changeZeitslot(Date wochentag, Date anfangszeit,
			Date endzeit) throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}

	@Override
	public Stundenplaneintrag changeStundenplaneintrag(Dozent d,
			Lehrveranstaltung l, Raum r, Zeitslot z, Semesterverband sv,
			Studiengang st) throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}

	@Override
	public Semesterverband changeSemsterverband(Studiengang bezeichnung,
			int semester, int studierendenAnzahl)
			throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
		return null;
	}

	
}
