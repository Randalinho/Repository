/**

 * 
 */
package de.hdm.itprojekt.client.gui;


import com.google.gwt.cell.client.AbstractCell;

import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

import de.hdm.itprojekt.shared.bo.Dozent;

/**
 * @author Thies & Hofmann
 *
 */


public class DozentCell extends AbstractCell<Dozent> {
	
	@Override
    public void render(Context context, Dozent value, SafeHtmlBuilder sb) {
      // Value can be null, so do a null check..
      if (value == null) {
        return;
      }

      sb.appendHtmlConstant("<div>");
      sb.appendEscaped(value.getNachname());
      sb.appendHtmlConstant(", ");
      sb.appendEscaped(value.getVorname());
      sb.appendHtmlConstant("</div>");
    }
}

