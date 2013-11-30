package de.hdm.itprojekt.client;

import com.google.gwt.user.client.ui.*;

/**
 * Diese Klasse ist die Basisklasse aller Demoklassen. Jede Demoklasse besteht aus einem
 * SplitLayoutPanel und l�sst sich somit unter GWT entsprechend anordnen.
 * 
 * @author Thies, Espich
* 
 */

public abstract class BasisKlasse extends SplitLayoutPanel {

	/**
	* Abstrakte Einschubmethode, die in den Subklassen zu realisieren ist.
 	* @return der Text, den wir als Headline setzen wollen. 
 	*/
	protected abstract String getHeadlineText();

	/**
	* Abstrakte Einschubmethode, die in den Subklassen zu realisieren ist.
	*/
	protected abstract void run();

		/**
	   * Jedes GWT Widget muss diese Methode implementieren. Sie gibt an, was
	   * geschehen soll, wenn eine Widget-Instanz zur Anzeige gebracht wird.
	   */
	  public void onLoad() {
		  
	    /*
	     * Bevor wir unsere eigene Formatierung veranslassen, �berlassen wir es der
	     * Superklasse eine Initialisierung vorzunehmen.
	     */
	    super.onLoad();
	    
	    /*
	     * Als erstes wird stets die Headline der Demoklasse ausgegeben. 
	     * Da getHeadlineText() als abstrakte Methode realisiert ist, 
	     * obliegt es den Subklassen, f�r eine Ausgestaltung also Implementierung zu sorgen.
	     */
	    this.add(this.createHeadline(this.getHeadlineText()));

	    /*
	     * Anschlie�end wird die run()-Methode aufgerufen. Auch run() ist als abstrakte Methode realisiert. 
	     * Auch hier ist es Aufgabe der Subklassen, f�r deren Implementierung zu sorgen.
	     */
	    this.run();
	  }

/**
 * Mit Hilfe dieser Methode k�nnen wir aus einem String ein mittels CSS
 * formatierbares HTML-Element erstellen. Unter CSS l�sst sich das Ergebnis �ber
 * <code>.itprojekt-headline</code> referenzieren bzw. formatieren.
 * 
 * @param text der String, den wir als andernorts HTML setzen wollen.
 * @return GWT HTML Widget.
 */
protected HTML createHeadline(String text) {
  HTML content = new HTML(text);
  content.setStylePrimaryName("itprojekt-headline");
  return content;
	}

/**
 * Mit Hilfe dieser Methode erstellen wir aus einem Strinng ein mittels CSS
 * formatierbares HTML-Element, das an das Ende der bisherigen Ausgabe dieses
 * Showcase angeh�ngt wird. Unter CSS l�sst sich das Ergebnis �ber
 * <code>.itprojekt-simpletext</code> referenzieren bzw. formatieren.
 * 
 * @param text der String, den wir als HTML an die bisherige Showcase-Ausgabe
 *          anh�ngen wollen.
 */
protected void append(String text) {
  HTML content = new HTML(text);
  content.setStylePrimaryName("itprojekt-simpletext");
  this.add(content);
	}

}
