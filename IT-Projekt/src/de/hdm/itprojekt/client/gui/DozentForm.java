/**

 * 
 */
package de.hdm.itprojekt.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Panel;


import de.hdm.itprojekt.client.ClientsideSettings;
import de.hdm.itprojekt.client.gui.UebersichtTreeViewModel;
import de.hdm.itprojekt.shared.VerwaltungsklasseAsync;
import de.hdm.itprojekt.shared.bo.Dozent;
import de.hdm.itprojekt.shared.Verwaltungsklasse;



/**
 * @author Thies & Hofmann
 *
 */
public class DozentForm extends HorizontalPanel{

	/**
	 * Aufbau der Seite, um den Dozent anzuzeigen, zu loeschen und zu bearbeiten
	 */
	
	TextBox nachnameTextBox = new TextBox();
	TextBox vornameTextBox = new TextBox();
	FlexTable tabelleDozent = new FlexTable();
	Label valueLabel = new Label();
	
	VerwaltungsklasseAsync verwaltungsklasse = ClientsideSettings
			.getVerwaltungsklasse();
	Dozent shownDozent = null;

	
	public DozentForm() {
		//FlexTable tabelleDozent = new FlexTable();
		
		Button loeschen = new Button("Löschen");
		loeschen.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				verwaltungsklasse.deleteDozent(shownDozent, new deleteDozentCallback(shownDozent));
				}
			});
		
		Button bearbeiten = new Button("Bearbeiten");
		bearbeiten.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				changeSelectedDozent(); 
				}
			});
		
		Button neuAnlegen = new Button ("neuen Dozent anlegen");
		neuAnlegen.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				String vorname = vornameTextBox.getText();
				String nachname = nachnameTextBox.getText();
				verwaltungsklasse.createDozent(vorname, nachname, new CreateDozentCallback());
			}
		});
		
		tabelleDozent.setText(0, 0, "nachname");
		tabelleDozent.setText(0, 1, "vorname");
		tabelleDozent.setWidget(1, 2, loeschen);
		tabelleDozent.setWidget(1, 2, bearbeiten);
		



		

		
		
		
		

	}
	
	
	void setFields () {
		nachnameTextBox.setText(shownDozent.getNachname());
		vornameTextBox.setText(shownDozent.getVorname());
	}
	
	void clearFields () {
		nachnameTextBox.setText("");
		vornameTextBox.setText("");
	}
	
	void setSelected (Dozent d) {
		if (d != null) {
			shownDozent = d;
			setFields();
		} else {
			clearFields();
		}
	}
	
	
	
	
	class deleteDozentCallback implements AsyncCallback<Dozent> {
		
		Dozent dozent = null;
		
		deleteDozentCallback(Dozent d) {
			dozent = d;
		}

		@Override
		public void onFailure(Throwable caught) {

		}

		@Override
		public void onSuccess(Dozent result) {
			if (dozent != null) {
				setSelected(null);
				catvm.removeDozent(dozent);
			}
		}
	}


	
	class CreateDozentCallback implements AsyncCallback<Dozent> {
		@Override
		public void onFailure(Throwable caught) {
			// this.showcase.append("Fehler bei der Abfrage " +
			// caught.getMessage());
		}

		public void onSuccess(Dozent dozent) {
			if (dozent != null) {
				ClientsideSettings.getLogger().info(
						"Kunde mit " + dozent.getVorname() + " "
								+ dozent.getNachname() + " wurde angelegt.");
				tabelleDozent.addDozent(dozent);
			}
		}
	}
	
	
	void changeSelectedDozent() {
		if (this.shownDozent!=null){
			shownDozent.setVorname(vornameTextBox.getText());
			shownDozent.setNachname(nachnameTextBox.getText());
			verwaltungsklasse.changeDozent(shownDozent, new AsyncCallback<Dozent>() {
				@Override
				public void onFailure(Throwable caught){					
				}
				@Override
				public void onSuccess(Dozent result){		
					tabelleDozent.updateCell(shownDozent);
				}
			});
		}
	}
	
	
}
