package de.hdm.itprojekt.client;

import com.google.gwt.user.client.ui.*;

/**
 * Diese Klasse ist die Basisklasse aller Demoklassen. Jede Demoklasse besteht aus einem
 * SplitLayoutPanel und lässt sich somit unter GWT entsprechend anordnen.
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
	     * Bevor wir unsere eigene Formatierung veranslassen, überlassen wir es der
	     * Superklasse eine Initialisierung vorzunehmen.
	     */
	    super.onLoad();
	    
	    /*
	     * Als erstes wird stets die Headline der Demoklasse ausgegeben. 
	     * Da getHeadlineText() als abstrakte Methode realisiert ist, 
	     * obliegt es den Subklassen, für eine Ausgestaltung also Implementierung zu sorgen.
	     */
	    this.add(this.createHeadline(this.getHeadlineText()));

	    /*
	     * Anschließend wird die run()-Methode aufgerufen. Auch run() ist als abstrakte Methode realisiert. 
	     * Auch hier ist es Aufgabe der Subklassen, für deren Implementierung zu sorgen.
	     */
	    this.run();
	  }

/**
 * Mit Hilfe dieser Methode können wir aus einem String ein mittels CSS
 * formatierbares HTML-Element erstellen. Unter CSS lässt sich das Ergebnis über
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
 * Showcase angehängt wird. Unter CSS lässt sich das Ergebnis über
 * <code>.itprojekt-simpletext</code> referenzieren bzw. formatieren.
 * 
 * @param text der String, den wir als HTML an die bisherige Showcase-Ausgabe
 *          anhängen wollen.
 */
protected void append(String text) {
  HTML content = new HTML(text);
  content.setStylePrimaryName("itprojekt-simpletext");
  this.add(content);
	}

}
