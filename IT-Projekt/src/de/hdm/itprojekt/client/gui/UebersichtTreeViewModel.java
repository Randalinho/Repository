/**
 * 
 */
package de.hdm.itprojekt.client.gui;

import java.util.HashMap;

import java.util.Map;

import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.TreeViewModel;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.gwt.user.client.ui.Tree;



import de.hdm.itprojekt.client.ClientsideSettings;
import de.hdm.itprojekt.shared.VerwaltungsklasseAsync;
import de.hdm.itprojekt.shared.bo.*;


/**
 * @author Thies, Hofmann
 *
 */
public class UebersichtTreeViewModel implements TreeViewModel{
	
	private DozentForm df;
	private RaumForm rf;
	private ZeitslotForm zf;
	private SemesterverbandForm sf;
	private LehrveranstaltungForm lf;
	
	private Dozent selectedDozent;
	private Raum selectedRaum;
	private Zeitslot selectedZeitslot;
	private Semesterverband selectedSemesterverband;
	private Lehrveranstaltung selectedLehrveranstaltung;
	
	VerwaltungsklasseAsync verwaltungsklasse = ClientsideSettings
			.getVerwaltungsklasse();
	private ListDataProvider<BusinessObjekt> boDataProvider;
	private Map<BusinessObjekt, ListDataProvider<Dozent>> dozentDataProviders = new HashMap<BusinessObjekt, ListDataProvider<Dozent>>();
	private Map<BusinessObjekt, ListDataProvider<Zeitslot>> zeitslotDataProviders = new HashMap<BusinessObjekt, ListDataProvider<Zeitslot>>();
	private Map<BusinessObjekt, ListDataProvider<Raum>> raumDataProviders = new HashMap<BusinessObjekt, ListDataProvider<Raum>>();
	private Map<BusinessObjekt, ListDataProvider<Semesterverband>> SemesterverbandDataProviders = new HashMap<BusinessObjekt, ListDataProvider<Semesterverband>>();
	private Map<BusinessObjekt, ListDataProvider<Lehrveranstaltung>> lehrveranstaltungDataProviders = new HashMap<BusinessObjekt, ListDataProvider<Lehrveranstaltung>>();
	
	private Map<Stundenplaneintrag, ListDataProvider<Stundenplaneintrag>> stundenplaneintragDataProviders = new HashMap<Stundenplaneintrag, ListDataProvider<Stundenplaneintrag>>();
	
	
	//private Map<Report, ListDataProvider<Stundenplan>> stundenplanDataProviders = new HashMap<Report, ListDataProvider<Stundenplan>>();
	
	//private Map<Report, ListDataProvider<Raumplan>> raumplanDataProviders = new HashMap<Report, ListDataProvider<Raumplan>>();
	
	
	public <T> NodeInfo<?> getNodeInfo(T value) {
		
		if (value instanceof String) {
			// Erzeugen eines ListDataProviders für BusinessObjekte
			boDataProvider = new ListDataProvider<BusinessObjekt>();
			verwaltungsklasse.getAllBusinessObjekt
		}
		
	}
	
	
	
	
	/**
	 * 
	 */
	public UebersichtTreeViewModel() {
		// TODO Auto-generated constructor stub
	}

}
