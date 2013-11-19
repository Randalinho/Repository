package de.hdm.itprojekt.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;

import de.hdm.itprojekt.shared.bo.*;

public interface VerwaltungsklasseAsync {

	void createDozent(String vorname, String nachname,
			AsyncCallback<Dozent> callback);

	void createLehrveranstaltung(String bezeichnung, int semester, int umfang,
			AsyncCallback<Lehrveranstaltung> callback);

	void createRaum(String name, int kapazitaet, AsyncCallback<Raum> callback);
	
	void createSemesterverband(String studiengang, int semester,
			int studierendenAnzahl, AsyncCallback<Semesterverband> callback);

}
