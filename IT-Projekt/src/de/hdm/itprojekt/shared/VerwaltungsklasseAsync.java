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
			Zeitslot z, Semesterverband sv,
			AsyncCallback<Stundenplaneintrag> callback);

	void createZeitslot(Date wochentag, Date anfangszeit, Date endzeit,
	AsyncCallback<Zeitslot> callback);

	void deleteDozent(Dozent d, AsyncCallback<Void> callback);

	void deleteLehrveranstaltung(Lehrveranstaltung l,
			AsyncCallback<Void> callback);

	void deleteRaum(Raum r, AsyncCallback<Void> callback);

	void deleteZeitslot(Zeitslot z, AsyncCallback<Void> callback);

	void deleteSemesterverband(Semesterverband sv, AsyncCallback<Void> callback);

	void deleteStundenplaneintrag(Stundenplaneintrag s,
			AsyncCallback<Void> callback);

	void deleteStudiengang(Studiengang sg, AsyncCallback<Void> callback);

	void changeDozent(Dozent d, AsyncCallback<Dozent> callback);

	void changeLehrveranstaltung(Lehrveranstaltung l,
			AsyncCallback<Lehrveranstaltung> callback);

	void changeRaum(Raum r, AsyncCallback<Raum> callback);

	void changeStundenplaneintrag(Stundenplaneintrag s,
			AsyncCallback<Stundenplaneintrag> callback);

	void changeStudiengang(Studiengang s, AsyncCallback<Studiengang> callback);

	void changeSemsterverband(Semesterverband sv,
			AsyncCallback<Semesterverband> callback);

	void changeZeitslot(Zeitslot z, AsyncCallback<Zeitslot> callback);
}
