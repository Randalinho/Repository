package de.hdm.itprojekt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.VerticalPanel;

import de.hdm.itprojekt.shared.VerwaltungsklasseAsync;
import de.hdm.itprojekt.shared.bo.*;
import de.hdm.itprojekt.client.BasisKlasse;
import de.hdm.itprojekt.shared.VerwaltungsklasseAsync;

/**
 * Hier wird ein neuer Dozent angelegt.
 * 
 * @author Thies, Espich
 * 
 */

public class CreateDozentDemo extends BasisKlasse {
	
	private VerticalPanel vPanel = new VerticalPanel ();
	private HorizontalPanel hPanel = new HorizontalPanel ();
	private HorizontalPanel hoPanel = new HorizontalPanel ();
	
	  /**
	   * Jede Demoklasse enthät eine Überschrift, die definiert, was der User machen kann.
	   * Diese ist durch die Methode @see BasisKlasse#getHeadlineText() zu erstellen ist.
	   */
	  @Override
	  protected String getHeadlineText() {
	    return "Dozent anlegen";
	  }

	  /**
	   * Unter der Überschrift trägt der User die Daten des neuen Dozenten ein. 
	   */
	  private final Label lbvorname = new Label ("Vorname"); 
	  private final Label lbnachname = new Label ("Nachname");
	  private final TextBox tbvorname = new TextBox ();
	  private final TextBox tbnachname = new TextBox ();
	  private final Button speichern = new Button ("speichern");
	  
	  /**
	  * Anordnen der Buttons und Labels auf den Panels
	  */
	  public void onLoad () {

			  hPanel.add(lbnachname);
			  hPanel.add(tbnachname);
			  hoPanel.add(lbvorname);
			  hoPanel.add(tbvorname);
			  vPanel.add(hPanel);
			  vPanel.add(hoPanel);
			  vPanel.add(speichern);
			  
			  RootPanel.get("it_projekt").add(vPanel);  
		  }
	  
	  /**
	   * Jede Demoklasse muss die <code>run()</code>-Methode implementieren. Sie ist
	   * eine "Einschubmethode", die von einer Methode der Basisklasse
	   * <code>BasisKlasse</code> aufgerufen wird, wenn die Demoklasse aktiviert wird.
	   */
	  @Override
	  protected void run() {
	    // Ankündigung, was nun geschehen wird.
	    this.append("Anlegen des neuen Dozenten mit dem Name");
	  }
	  	  
}