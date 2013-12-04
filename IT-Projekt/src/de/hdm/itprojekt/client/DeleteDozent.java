package de.hdm.itprojekt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.DialogBox;

import de.hdm.itprojekt.shared.VerwaltungsklasseAsync;
import de.hdm.itprojekt.shared.bo.*;
import de.hdm.itprojekt.client.ClientsideSettings;
import de.hdm.itprojekt.client.BasisKlasse;
import de.hdm.itprojekt.client.DeleteDozentDemo.DozentDeletedCallback;
import de.hdm.itprojekt.shared.VerwaltungsklasseAsync;
import de.hdm.itprojekt.shared.bo.Dozent;


public class DeleteDozent extends BasisKlasse {
	
	  @Override
	  protected String getHeadlineText() {
	    return "Dozent löschen";
	  }

	  @Override
	  protected void run() {
	    this.append("Löschen des Dozenten");
	  }	  
	  

class DeleteDozentCallback implements AsyncCallback<Dozent> {
    private BasisKlasse bk = null;

    public DeleteDozentCallback(BasisKlasse a) {
      this.bk = a;
    }

    @Override
    public void onFailure(Throwable caught) {
      this.bk.append("Fehler bei der Abfrage " + caught.getMessage());
    }

    public void onSuccess(Dozent dozent) {
      if (dozent != null) {
        VerwaltungsklasseAsync schulVerwaltung = ClientsideSettings.getVerwaltungsklasse();
        this.bk.append("Lösche Kunde " + dozent.getVorname() + " " + dozent.getNachname());
        schulVerwaltung.deleteDozent(dozent, new DozentDeletedCallback(this.bk));
      }
    }
  }

class DozentDeletedCallback implements AsyncCallback<Void> {
    private BasisKlasse bk = null;

    public DozentDeletedCallback(BasisKlasse b) {
      this.bk = b;
    }

    @Override
    public void onFailure(Throwable caught) {
      this.bk.append("Fehler bei der Abfrage " + caught.getMessage());
    }

    public void onSuccess(Void result) {
      this.bk.append("Kunde erfolgreich gelöscht");
    }
  }

