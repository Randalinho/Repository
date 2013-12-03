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

	public Vector<Dozent> getStundenplaneintragOf(Dozent d)
		      throws IllegalArgumentException {
		 	//return this.DozentenMapper.findByKey(d.getId());
	}

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
	
	public Raum createRaum(String bezeichnung, int kapazitaet)
			throws IllegalArgumentException {
		Raum a = new Raum();
		a.setBezeichnung(bezeichnung);
		a.setKapazitaet(kapazitaet);
		
		a.setId(1);
		
		//Raummapper.insert
		return null;
	}

	public Studiengang createStudiengang(String bezeichnung)
			throws IllegalArgumentException {
		
		Studiengang s = new Studiengang();
		
		s.setBezeichnung(bezeichnung);
		
		s.setId(1);
		
		//studiengangmapper.insert
		return null;
	}

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
	public Semesterverband createSemesterverband(Studiengang bezeichnung,
			int semester, int studierendenAnzahl, String jahrgang)
			throws IllegalArgumentException {
		Semesterverband a = new Semesterverband();
		a.setBezeichnung(bezeichnung);
		a.setSemester(semester);
		a.setStudierendenAnzahl(studierendenAnzahl);
		a.setJahrgang(jahrgang);
		
		a.setId(1);
		
		//semesterverbandmapper.insert
		return null;
	}

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

	public void deleteDozent(Dozent d) throws IllegalArgumentException {
		
		Vector<Dozent> dozenten = this.getStundenplaneintragOf(d);

		    if (dozenten != null) {
		    	//Bildschirmmeldung: Dozent kann nicht geloescht werden, da noch Stundenplaneinträge
		    } else {
		 //   	this.DozentMapper.delete(d);
		    }
	}
	
	public void deleteLehrveranstaltung(Lehrveranstaltung a)
			throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
	}

	public void deleteZeitslot(Zeitslot z) throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
	}

	public void deleteStudiengang(Studiengang studiengang)
			throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
	}

	public void deleteStundenplaneintrag(Stundenplaneintrag s)
			throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
	}

	public void deleteRaum(Raum a) throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
	}

	public void deleteSemesterverband(Semesterverband a)
			throws IllegalArgumentException {
		//Objekt abspeichern in die Datenbank, hier muss man den jeweiligen Mapper returnen
	}

	public Dozent changeDozent(Dozent d) throws IllegalArgumentException {
		// this.DozentMapper.update(d);
		return null;
	}

	public Stundenplaneintrag changeStundenplaneintrag(Stundenplaneintrag s)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Lehrveranstaltung changeLehrveranstaltung(Lehrveranstaltung l)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Raum changeRaum(Raum r) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Semesterverband changeSemsterverband(Semesterverband sv)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Studiengang changeStudiengang(Studiengang s)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Zeitslot changeZeitslot(Zeitslot z) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
