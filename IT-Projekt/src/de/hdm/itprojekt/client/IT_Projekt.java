package de.hdm.itprojekt.client;

import de.hdm.itprojekt.server.shared.FieldVerifier;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;



/**
 * EntryPoint Klasse des Projekts <b>IT-Projekt</b>
 * Diese Klasse implementiert das Interface <code>EntryPoint</code>
   * daher benötigen wir die Methode <code>public void onModuleLoad()</code>. 
   * Sie ist das GWT-Pendant der <code>main()</code>-Methode normaler Java-Applikationen.
 */

public class IT_Projekt implements EntryPoint {
	
	public void onModuleLoad() {
		
		/*
	     * Die Seite besteht aus zwei seperaten horizontalen Panels. 
	     * Im rechten Panel wird der Navigator in Form einer Baumstruktur der Stamm,- und Bewegunsdaten, 
	     * sowie des Reports realisiert.
	     * Im linken Panel wird der Inhalt realisiert. 
	     * Daher bietet sich ein SplitLayoutPanel als Container an.
	     */
		SplitLayoutPanel s = new SplitLayoutPanel();
		s.addWest (new HTML ("navigation"), 130);
		SplitLayoutPanel p = new SplitLayoutPanel();
		p.addEast (new HTML("content"), 380);

	    /*
	     * Das SplitLayoutPanel wird einem DIV-Element namens "Navigator" und "Content" in der
	     * zugehörigen HTML-Datei zugewiesen und erhält so seinen Darstellungsort.
	     */
	    RootPanel.get("Navigator").add(s);
	    RootPanel.get("Content").add(p);
	    
	    /*
	     * Ab hier bauen wir sukzessive den Navigator mit seinen Buttons aus.
	     */
	    final Button createDozentButton = new Button ("Dozent anlegen");
	    final Button changeDozentButton = new Button ("Dozent bearbeiten");
	    final Button deleteDozentButton = new Button ("Dozent löschen");
	    
	    final Button createZeitslotButton = new Button ("Zeitslot anlegen");
	    final Button changeZeitslotButton = new Button ("Zeitslot bearbeiten");
	    final Button deleteZeitslotButton = new Button ("Zeitslot löschen");
		
	    final Button createRaumButton = new Button ("Raum anlegen");
	    final Button changeRaumButton = new Button ("Raum bearbeiten");
	    final Button deleteRaumButton = new Button ("Raum löschen");
		
	    final Button createSemesterverbandButton = new Button ("Semesterverband anlegen");
	    final Button changeSemesterverbandButton = new Button ("Semesterverband bearbeiten");
	    final Button deleteSemesterverbandButton = new Button ("Semesterverband löschen");
		
	    final Button createLehrveranstaltungButton = new Button ("Lehrveranstaltung anlegen");
	    final Button changeLehrveranstaltungButton = new Button ("Lehrveranstaltung bearbeiten");
	    final Button deleteLehrveranstaltungButton = new Button ("Lehrveranstaltung löschen");
	    
	    final Button createStudiengangButton = new Button ("Studiengang anlegen");
	    final Button changeStudiengangButton = new Button ("Studiengang bearbeiten");
	    final Button deleteStudiengangButton = new Button ("Studiengang löschen");
	    
	    final Button createStundenplaneintragButton = new Button ("Stundenpplaneintrag anlegen");
	    final Button changeStundenplaneintragButton = new Button ("Stundenplaneintrag bearbeiten");
	    final Button deleteStundenplaneintragButton = new Button ("Stundenplaneintrag löschen");
	    	    
	    /*
	     * Unter welchem Namen können wir den Button durch die CSS-Datei des
	     * Projekts formatieren?
	     */
	    createDozentButton.setStylePrimaryName("it-projekt-createbutton");
	    changeDozentButton.setStylePrimaryName("it-projekt-change-deletebutton");
	    deleteDozentButton.setStylePrimaryName("it-projekt-change-deletebutton");
	    createZeitslotButton.setStylePrimaryName("it-projekt-createbutton");
	    changeZeitslotButton.setStylePrimaryName("it-projekt-change-deletebutton");
	    deleteZeitslotButton.setStylePrimaryName("it-projekt-change-deletebutton");
	    createRaumButton.setStylePrimaryName("it-projekt-createbutton");
	    changeRaumButton.setStylePrimaryName("it-projekt-change-deletebutton");
	    deleteRaumButton.setStylePrimaryName("it-projekt-change-deletebutton");
	    createSemesterverbandButton.setStylePrimaryName("it-projekt-createbutton");
	    changeSemesterverbandButton.setStylePrimaryName("it-projekt-change-deletebutton");
	    deleteSemesterverbandButton.setStylePrimaryName("it-projekt-change-deletebutton");
	    createLehrveranstaltungButton.setStylePrimaryName("it-projekt-createbutton");
	    changeLehrveranstaltungButton.setStylePrimaryName("it-projekt-change-deletebutton");
	    deleteLehrveranstaltungButton.setStylePrimaryName("it-projekt-change-deletebutton");
	    createStudiengangButton.setStylePrimaryName("it-projekt-createbutton");
	    changeStudiengangButton.setStylePrimaryName("it-projekt-change-deletebutton");
	    deleteStudiengangButton.setStylePrimaryName("it-projekt-change-deletebutton"); 
	    createStundenplaneintragButton.setStylePrimaryName("it-projekt-createbutton");
	    changeStundenplaneintragButton.setStylePrimaryName("it-projekt-change-deletebutton");
	    deleteStundenplaneintragButton.setStylePrimaryName("it-projekt-change-deletebutton");   
	    /*
	     * Hinzufügen dieser Buttons zum rechten Panel.
	     */
	    p.add(createDozentButton);
	    p.add(changeDozentButton);
	    p.add(deleteDozentButton);
	    p.add(createZeitslotButton);
	    p.add(changeZeitslotButton);
	    p.add(deleteZeitslotButton);
	    p.add(createRaumButton);
	    p.add(changeRaumButton);
	    p.add(deleteRaumButton);
	    p.add(createSemesterverbandButton);
	    p.add(changeSemesterverbandButton);
	    p.add(deleteSemesterverbandButton);
	    p.add(createLehrveranstaltungButton);
	    p.add(changeLehrveranstaltungButton);
	    p.add(deleteLehrveranstaltungButton);
	    p.add(createStudiengangButton);
	    p.add(changeStudiengangButton);
	    p.add(deleteStudiengangButton);
	    p.add(createStundenplaneintragButton);
	    p.add(changeStundenplaneintragButton);
	    p.add(deleteStundenplaneintragButton);
	    
	    /*
	     * Um das Verhalten beim draufklicken des Buttons zu realisieren, 
	     * haben wir einen ClickHandler verwendet, durch den durch klicken mit der Mouse auf den Button
	     * die onClick()-Methode aufgerufen wird.
         * Es wurde ein separates DIV-Element namens "details" in die zugehörige HTML-Datei eingefügt.
         * Bevor der neue Showcase dort eingefügt wird, werden zunächst alle bisherigen
         * Elemente dieses DIV gelöscht.
         */
	    createDozentButton.addClickHandler(new ClickHandler() {
	      public void onClick(ClickEvent event) {
	        BasisKlasse bk = new CreateDozentDemo();
	        RootPanel.get("details").clear();
	        RootPanel.get("details").add(bk);
	      }
	    });

	    changeDozentButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new ChangeDozentDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });

	    deleteDozentButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new DeleteDozentDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });

	    createZeitslotButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new CreateZeitslotDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });

	    changeZeitslotButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new ChangeZeitslotDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });	   
	    
	    deleteZeitslotButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new DeleteZeitslotDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });	    
	    
	    createRaumButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new CreateRaumDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });	    
	  
	    
	    changeRaumButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new ChangeRaumDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });	 
	    
	    deleteRaumButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new DeleteRaumDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });	 
	    
	    createSemesterverbandButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new CreateSemesterverbandDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });	 
	   
	    changeSemesterverbandButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new ChangeSemesterverbandDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });	 
	    
	    deleteSemesterverbandButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new DeleteSemesterverbandDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });	 
	    
	    createLehrveranstaltungButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new CreateLehrveranstaltungDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });	 
	    
	    changeLehrveranstaltungButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new ChangeLehrveranstaltungDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });	 
	    
	    deleteLehrveranstaltungButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new DeleteLehrveranstaltungDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });	 
	    
	    createStudiengangButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new CreateStudiengangDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });
	    
	    changeStudiengangButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new ChangeStudiengangDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });
	    
	    deleteStudiengangButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new DeleteStudiengangDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });
	    
	    createStundenplaneintragButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new CreateStundenplaneintragDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });
	    
	    changeStundenplaneintragButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new ChangeStundenplaneintragDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });
	    
	    deleteStundenplaneintragButton.addClickHandler(new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        BasisKlasse bk = new DeleteStundenplaneintragDemo();
		        RootPanel.get("details").clear();
		        RootPanel.get("details").add(bk);
		      }
		    });
	}
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
			/**
			 * Send the name from the nameField to the server and wait for a response.
			 */
			private void sendNameToServer() {
				// First, we validate the input.
				errorLabel.setText("");
				String textToServer = nameField.getText();
				if (!FieldVerifier.isValidName(textToServer)) {
					errorLabel.setText("Please enter at least four characters");
					return;
				}

				// Then, we send the input to the server.
				sendButton.setEnabled(false);
				textToServerLabel.setText(textToServer);
				serverResponseLabel.setText("");
				greetingService.greetServer(textToServer,
						new AsyncCallback<String>() {
							public void onFailure(Throwable caught) {
								// Show the RPC error message to the user
								dialogBox
										.setText("Remote Procedure Call - Failure");
								serverResponseLabel
										.addStyleName("serverResponseLabelError");
								serverResponseLabel.setHTML(SERVER_ERROR);
								dialogBox.center();
								closeButton.setFocus(true);
							}

							public void onSuccess(String result) {
								dialogBox.setText("Remote Procedure Call");
								serverResponseLabel
										.removeStyleName("serverResponseLabelError");
								serverResponseLabel.setHTML(result);
								dialogBox.center();
								closeButton.setFocus(true);
							}
						});
			}
		}

		// Add a handler to send the name to the server
		MyHandler handler = new MyHandler();
		sendButton.addClickHandler(handler);
		nameField.addKeyUpHandler(handler);
	}
}
