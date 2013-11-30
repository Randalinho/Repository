package de.hdm.itprojekt.client;

import java.util.logging.Logger;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

import de.hdm.itprojekt.shared.*;
import de.hdm.itprojekt.client.ClientsideSettings;
import de.hdm.itprojekt.shared.Verwaltungsklasse;
import de.hdm.itprojekt.shared.VerwaltungsklasseAsync;
import de.hdm.itprojekt.shared.ReportGenerator;
import de.hdm.itprojekt.shared.ReportGeneratorAsync;

	/**
	 * Klasse mit Eigenschaften und Diensten, die f�r alle Client-seitigen Klassen
	 * relevant sind.
	 * 
	 * @author Thies, Espich
	 */
public class ClientsideSettings extends CommonSettings {
	
	/**
	   * Remote Service Proxy zur Verbindungsaufnahme mit dem Server-seitgen Dienst
	   * namens <code>Verwaltungsklasse</code>.
	   */
	  private static VerwaltungsklasseAsync schulVerwaltung = null;

	  /**
	   * Remote Service Proxy zur Verbindungsaufnahme mit dem Server-seitgen Dienst
	   * namens <code>ReportGenerator</code>.
	   */
	  private static ReportGeneratorAsync reportGenerator = null;

	  /**
	   * Name des Client-seitigen Loggers.
	   */
	  private static final String LOGGER_NAME = "IT-Projekt Web Client";
	  
	  /**
	   * Instanz des Client-seitigen Loggers.
	   */
	  private static final Logger log = Logger.getLogger(LOGGER_NAME);

	  /**
	   *  @return die Logger-Instanz f�r die Server-Seite
	   */
	  public static Logger getLogger() {
		  return log;
	  }
	  
	  /**
	   * Anlegen und Auslesen der applikationsweit eindeutigen Verwaltungsklasse. Diese
	   * Methode erstellt die Verwaltungsklasse, sofern sie noch nicht existiert. Bei
	   * wiederholtem Aufruf dieser Methode wird stets das bereits zuvor angelegte
	   * Objekt zur�ckgegeben.
	   * Der Aufruf dieser Methode erfolgt im Client z.B. durch
	   * <code>VerwaltungsklasseAsync schulVerwaltung = ClientSideSettings.getVerwaltungsklasse()</code>.
	   * @return eindeutige Instanz des Typs <code>VerwaltungsklasseAsync</code>
	   */
	  public static VerwaltungsklasseAsync getVerwaltungsklasse() {
	    // Gab es bislang noch keine BankAdministration-Instanz, dann...
	    if (schulVerwaltung == null) {
	      // Zun�chst instantiieren wir BankAdministration
	      schulVerwaltung = GWT.create(Verwaltungsklasse.class);
	    }

	    // Nun brauchen wir die BankAdministration nur noch zur�ckzugeben.
	    return schuleVerwaltung;
	  }

	  /**
	   * Anlegen und Auslesen des applikationsweit eindeutigen ReportGenerators.
	   * Diese Methode erstellt den ReportGenerator, sofern dieser noch nicht
	   * existiert. Bei wiederholtem Aufruf dieser Methode wird stets das bereits
	   * zuvor angelegte Objekt zur�ckgegeben.
	   * Der Aufruf dieser Methode erfolgt im Client z.B. durch
	   * <code>ReportGeneratorAsync reportGenerator = ClientSideSettings.getReportGenerator()</code>.
	   * @return eindeutige Instanz des Typs <code>BankAdministrationAsync</code>
	   */
	  public static ReportGeneratorAsync getReportGenerator() {
	    // Gab es bislang noch keine ReportGenerator-Instanz, dann...
	    if (reportGenerator == null) {
	      // Zun�chst instantiieren wir ReportGenerator
	      reportGenerator = GWT.create(ReportGenerator.class);

	      final AsyncCallback<Void> initReportGeneratorCallback = new AsyncCallback<Void>() {
	        public void onFailure(Throwable caught) {
	          ClientsideSettings.getLogger().severe(
	              "Der ReportGenerator konnte nicht initialisiert werden!");
	        }

	        public void onSuccess(Void result) {
	          ClientsideSettings.getLogger().info(
	              "Der ReportGenerator wurde initialisiert.");
	        }
	      };

	      reportGenerator.init(initReportGeneratorCallback);
	    }

	    // So, nun brauchen wir den ReportGenerator nur noch zur�ckzugeben.
	    return reportGenerator;
	  }

}