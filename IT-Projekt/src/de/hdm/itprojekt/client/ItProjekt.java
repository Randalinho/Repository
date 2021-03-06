package de.hdm.itprojekt.client;

/* import de.hdm.itprojekt.server.shared.FieldVerifier;
 */

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;

import de.hdm.itprojekt.client.gui.*;


/**
 * EntryPoint Klasse des Projekts <b>ItProjekt</b>
 * Diese Klasse implementiert das Interface <code>EntryPoint</code>
   * daher ben�tigen wir die Methode <code>public void onModuleLoad()</code>. 
   * Sie ist das GWT-Pendant der <code>main()</code>-Methode normaler Java-Applikationen.
 */

public class ItProjekt implements EntryPoint {
	
	protected String getHeadlineText() {
		return this.getHeadlineText();
	}
	
	public void onModuleLoad() {
			
		/*
		 * Die Anwendung besteht aus zwei seperaten horizontalen Panels. Im rechten Panel wird ein Navigationsteil 
		 * mit Baumstruktur der Stamm,- und Bewegunsdaten, sowie des Reports realisiert.
		 * Im linken Panel wird der Inhalt, einem Datenteil mit Formularen realisiert. 
	     * Daher bietet sich ein SplitLayoutPanel als Container an.
	     *
	     */
		/**		
		RootLayoutPanel rlp = RootLayoutPanel.get();
		SplitLayoutPanel mainPanel = new SplitLayoutPanel();
		rlp.add(mainPanel);
		
		VerticalPanel detailsPanel = new VerticalPanel();	
		
		ScrollPanel navigation = new ScrollPanel(new Tree());
		navigation.setHeight("300px");
		
		mainPanel.addWest(new HTML ("navigation"), 150);
		mainPanel.addEast(new HTML ("detailsPanel"), 350);
		
		RootPanel.get("ItProjektFrame").add(rlp);
			 */

	  	SplitLayoutPanel s = new SplitLayoutPanel();
	 	s.addWest (new HTML ("navigation"), 130);
	 	SplitLayoutPanel p = new SplitLayoutPanel();
	 	p.addEast (new HTML("detailsPanel"), 380);
	 	RootPanel.get("ItProjektFrame").add(s);
	    RootPanel.get("ItProjektFrame").add(p);


	    /*
	     * Das SplitLayoutPanel wird einem DIV-Element namens "Details" in der
	     * zugeh�rigen HTML-Datei zugewiesen und erh�lt so seinen Darstellungsort.
	     */
	    
	    /*
	     * Ab hier bauen wir sukzessive den Navigator mit seinen Buttons aus.
	     */
	    final Button dozentButton = new Button ("Dozent");
	    final Button zeitslotButton = new Button ("Zeitslot");
	    final Button raumButton = new Button ("Raum");
	    final Button semesterverbandButton = new Button ("Semesterverband");
	    final Button lehrveranstaltungButton = new Button ("Lehrveranstaltung");
	    final Button studiengangButton = new Button ("Studiengang");
	    final Button stundenplaneintragButton = new Button ("Stundenplaneintrag");
	    final Button raumplanButton = new Button ("Raumplan");
	    final Button stundenplanButton = new Button ("Stundenplan");
	    	    
	    /*
	     * Unter welchem Namen k�nnen wir den Button durch die CSS-Datei des
	     * Projekts formatieren?
	     */
	    dozentButton.setStylePrimaryName("BaumButton");
	    zeitslotButton.setStylePrimaryName("BaumButton");
	    raumButton.setStylePrimaryName("BaumButton");
	    semesterverbandButton.setStylePrimaryName("BaumButton");
	    lehrveranstaltungButton.setStylePrimaryName("BaumButton");
	    studiengangButton.setStylePrimaryName("BaumButton");
	    stundenplaneintragButton.setStylePrimaryName("BaumButton");
	    stundenplanButton.setStylePrimaryName("BaumButton");
	    raumplanButton.setStylePrimaryName("BaumButton");
	    
	    Tree uebersicht = new Tree();
		
		TreeItem report = new TreeItem();
		report.setText("Report");
		report.addItem(stundenplanButton);
		report.addItem(raumplanButton);
			
		stundenplanButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				StundenplanForm spf = new StundenplanForm();
				RootPanel.get("ItProjektFrame").clear();
				RootPanel.get("ItProjektFrame").add(spf);
			}
		});
		
		raumplanButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				RaumplanForm rpf = new RaumplanForm();
				RootPanel.get("ItProjektFrame").clear();
				RootPanel.get("ItProjektFrame").add(rpf);
			}
		});
				
		TreeItem stammdaten = new TreeItem();
		stammdaten.setText("Stammdaten");
		stammdaten.addItem(dozentButton);
		stammdaten.addItem(zeitslotButton);
		stammdaten.addItem(raumButton);
		stammdaten.addItem(studiengangButton);
		stammdaten.addItem(semesterverbandButton);
		stammdaten.addItem(lehrveranstaltungButton);
		
		dozentButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				DozentForm df = new DozentForm();
				RootPanel.get("ItProjektFrame").clear();
				RootPanel.get("ItProjektFrame").add(df);
			}
		});
		
		zeitslotButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event) {
				ZeitslotForm zf = new ZeitslotForm();
				RootPanel.get("ItProjektFrame").clear();
				RootPanel.get("ItProjektFrame").add(zf);
			}
		});
		
		raumButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event) {
				RaumForm rf = new RaumForm();
				RootPanel.get("ItProjektFrame").clear();
				RootPanel.get("ItProjektFrame").add(rf);
			}
		});
		
		studiengangButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event) {
				StudiengangForm sgf = new StudiengangForm();
				RootPanel.get("ItProjektFrame").clear();
				RootPanel.get("ItProjektFrame").add(sgf);
			}
		});
		
		semesterverbandButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event) {
				SemesterverbandForm svf = new SemesterverbandForm();
				RootPanel.get("ItProjektFrame").clear();
				RootPanel.get("ItProjektFrame").add(svf);
			}
		});
		
		/*lehrveranstaltungButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event) {
				LehrveranstaltungForm lf = new LehrveranstaltungForm();
				RootPanel.get("ItProjektFrame").clear();
				RootPanel.get("ItProjektFrame"),add(lf);
			}
		}); */
		
		
		TreeItem bewegungsdaten = new TreeItem();
		bewegungsdaten.setText("Bewegungsdaten");
		bewegungsdaten.addItem(stundenplaneintragButton);
		
		stundenplaneintragButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event) {
				StundenplaneintragForm sef = new StundenplaneintragForm();
				RootPanel.get("ItProjektFrame").clear();
				RootPanel.get("ItProjektFrame").add(sef);
			}
		});
		
		uebersicht.addItem(report);
		uebersicht.addItem(stammdaten);
		uebersicht.addItem(bewegungsdaten);
		
		RootPanel.get("navigation").add(uebersicht);
		
	}
}


	    
	    
	    
	    
	    
	    
	    
	    /*
	     * Hinzuf�gen des Baums zum linken Panel.
	     */

	 
	    
	    
	    /*
	     * Um das Verhalten beim draufklicken des Buttons zu realisieren, 
	     * haben wir einen ClickHandler verwendet, durch den durch klicken mit der Mouse auf den Button
	     * die onClick()-Methode aufgerufen wird.
         * Es wurde ein separates DIV-Element namens "details" in die zugeh�rige HTML-Datei eingef�gt.
         * Bevor der neue Showcase dort eingef�gt wird, werden zun�chst alle bisherigen
         * Elemente dieses DIV gel�scht.         */

	
	
	
	    
	    
	    
	    /*
		 * Auch dem Report-Generator weisen wir dieses Bank-Objekt zu. Es wird
		 * dort f�r die Darstellung der Adressdaten des Kreditinstituts
		 * ben�tigt.
		 
		ReportGeneratorAsync reportGenerator = ClientsideSettings
				.getReportGenerator();
		reportGenerator.setBank(bank, new SetBankCallback());
		*/
	   