package de.hdm.itprojekt.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.VerticalPanel;

import de.hdm.itprojekt.shared.VerwaltungsklasseAsync;
import de.hdm.itprojekt.shared.bo.*;
import de.hdm.itprojekt.client.ItProjekt;


	/**
	 * Hier wird ein neuer Raum angelegt.
	 * 
	 * @author Thies, Espich
	 * 
	 */

	public class CreateRaum extends ItProjekt {
		
		private VerticalPanel vPanel = new VerticalPanel ();
		private HorizontalPanel hPanel = new HorizontalPanel ();
		private HorizontalPanel hoPanel = new HorizontalPanel ();
		
		  /**
		   * Jede Demoklasse enth�t eine �berschrift, die definiert, was der User machen kann.
		   * Diese ist durch die Methode @see BasisKlasse#getHeadlineText() zu erstellen ist.
		   */
		  @Override
		  protected String getHeadlineText() {
		    return "Raum anlegen";
		  }

		  /**
		   * Unter der �berschrift tragt der User die Daten des neuen Raum ein. 
		   */
		  private final Label lbbezeichnung = new Label ("Bezeichnung"); 
		  private final Label lbkapazit�t = new Label ("Kapazit�t");
		  private final TextBox tbbezeichnung = new TextBox ();
		  private final TextBox tbkapazit�t = new TextBox ();
		  private final Button speichern = new Button ("speichern");
		  
		  /**
		  * Anordnen der Buttons und Labels auf den Panels
		  */
		  public void onLoad () {

				  hPanel.add(lbbezeichnung);
				  hPanel.add(tbbezeichnung);
				  hoPanel.add(lbkapazit�t);
				  hoPanel.add(tbkapazit�t);
				  vPanel.add(hPanel);
				  vPanel.add(hoPanel);
				  vPanel.add(speichern);
				  
				  RootPanel.get("it_projekt").add(vPanel); 
				  
				  tbbezeichnung.setFocus(true);
				  tbkapazit�t.setFocus(true);	  
				  
				  speichern.addClickHandler(new ClickHandler() {
					  public void onClick(ClickEvent event) {
						  boolean allFilled = true;
						  if (tbbezeichnung.getText().isEmpty());
						  if (tbkapazit�t.getText().isEmpty());
						  {	allFilled = false;
						  Window.alert ("Bitte f�llen Sie alle Felder aus."); }
						  
						  if (allFilled == true) { 
						  Raum r = new Raum ();
						  r.setBezeichnung(tbbezeichnung.getText());
						  r.setKapazitaet(tbkapazit�t.getTabIndex());
						  }
						  }
						  });
		  }

		  
		  /** 
		  * Wir nutzen eine Nested Class.
		  */
		 
		  class CreateRaumCallback implements AsyncCallback<Raum> {
			    private CreateRaum rd = null;

			    public CreateRaumCallback(CreateRaum a) {
			      this.rd = a;
			    }

			    @Override
			    public void onFailure(Throwable caught) {
				      Window.alert("Der Raum konnte nicht angelegt werden.");
			    }

				@Override
				public void onSuccess(Raum result) {
					tbbezeichnung.setText("");
					tbkapazit�t.setText("");
					Window.alert("Erfolgreich gespeichert."); 
				}
				}
		  	  
	}

