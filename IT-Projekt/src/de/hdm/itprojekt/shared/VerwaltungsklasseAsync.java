package de.hdm.itprojekt.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;

import de.hdm.itprojekt.shared.bo.*;

public interface VerwaltungsklasseAsync {
	
	void init(AsyncCallback<Void> callback);

	void createDozent(String vorname, String nachname, String email,
			AsyncCallback<Dozent> callback);

	void createLehrveranstaltung(String bezeichnung, int semester, int umfang,
			AsyncCallback<Lehrveranstaltung> callback);

	void createRaum(String name, int kapazitaet, AsyncCallback<Raum> callback);
	
	void createSemesterverband(String studiengang, int semester,
			int studierendenAnzahl, AsyncCallback<Semesterverband> callback);

	void deleteDozent(Dozent a, AsyncCallback<Dozent> callback);

	void deleteLehrveranstaltung(Lehrveranstaltung a,
			AsyncCallback<Lehrveranstaltung> callback);

	void deleteRaum(Raum a, AsyncCallback<Raum> callback);

	void deleteSemesterverband(Semesterverband a,
			AsyncCallback<Semesterverband> callback);

	void changeDozent(String vorname, String nachname, String email,
			AsyncCallback<Dozent> callback);

	void changeLehrveranstaltung(String bezeichnung, int semester, int umfang,
			AsyncCallback<Lehrveranstaltung> callback);

	void changeRaum(String name, int kapazitaet, AsyncCallback<Raum> callback);

	void changeSemsterverband(String studiengang, int semester,
			int studierendenAnzahl, AsyncCallback<Semesterverband> callback);


}
