package de.hdm.itprojekt.shared;

import java.util.Date;

import com.google.gwt.user.client.rpc.AsyncCallback;

import de.hdm.itprojekt.shared.bo.*;

public interface VerwaltungsklasseAsync {
	
	void init(AsyncCallback<Void> callback);

	void createLehrveranstaltung(String bezeichnung, int semester, int umfang,
			AsyncCallback<Lehrveranstaltung> callback);

	void createDozent(String vorname, String nachname, String email,
	AsyncCallback<Dozent> callback);

	void createRaum(String bezeichnung, int kapazitaet, AsyncCallback<Raum> callback);
	
	void createSemesterverband(Studiengang bezeichnung, int semester,
			int studierendenAnzahl, String jahrgang,
			AsyncCallback<Semesterverband> callback);

	void createStudiengang(String bezeichnung,
	AsyncCallback<Studiengang> callback);

	void createStundenplaneintrag(Dozent d, Lehrveranstaltung l, Raum r,
	Zeitslot z, Semesterverband sv, Studiengang st,
	AsyncCallback<Stundenplaneintrag> callback);

	void deleteDozent(Dozent a, AsyncCallback<Dozent> callback);

	void deleteLehrveranstaltung(Lehrveranstaltung a,
			AsyncCallback<Lehrveranstaltung> callback);

	void deleteRaum(Raum a, AsyncCallback<Raum> callback);

	void deleteSemesterverband(Semesterverband a,
			AsyncCallback<Semesterverband> callback);

	void deleteStundenplaneintrag(Stundenplaneintrag s,
	AsyncCallback<Stundenplaneintrag> callback);

	void deleteStudiengang(Studiengang studiengang,
	AsyncCallback<Studiengang> callback);

	void changeDozent(String vorname, String nachname, String email,
			AsyncCallback<Dozent> callback);

	void changeLehrveranstaltung(String bezeichnung, int semester, int umfang,
			AsyncCallback<Lehrveranstaltung> callback);

	void changeRaum(String bezeichnung, int kapazitaet, AsyncCallback<Raum> callback);

	void changeStundenplaneintrag(Dozent d, Lehrveranstaltung l, Raum r,
			Zeitslot z, Semesterverband sv, Studiengang st,
			AsyncCallback<Stundenplaneintrag> callback);

	void changeStudiengang(String bezeichnung,
			AsyncCallback<Studiengang> callback);

	void changeSemsterverband(Studiengang bezeichnung, int semester,
			int studierendenAnzahl, String semesterverband,
			AsyncCallback<Semesterverband> callback);

	void createZeitslot(Date wochentag, Date anfangszeit, Date endzeit,
			AsyncCallback<Zeitslot> callback);

	void deleteZeitslot(Zeitslot z, AsyncCallback<Zeitslot> callback);

	void changeZeitslot(Date wochentag, Date anfangszeit, Date endzeit,
			AsyncCallback<Zeitslot> callback);


}
