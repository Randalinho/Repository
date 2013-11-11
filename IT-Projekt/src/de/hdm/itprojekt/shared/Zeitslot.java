package de.hdm.itprojekt.shared;

public class Zeitslot extends BusinessObjekt {
	
	private int zeitslotId;
	//wochentag als Zhal, einfach zu implementieren oder?
	//Mo=1,Di=2;Mi=3;Do=4;Fr=5;Sa=6
	private int wochentag;
	private int anfangszeit;
	private int endzeit;
	private int dauer;
	
	public void setZeitslotId(int zeitslotId){
		this.zeitslotId = zeitslotId;
	}
	
	public void setWochentag(int wochentag){
		this.wochentag = wochentag;
	}
	
	public void setAnfangszeit(int anfangszeit){
		this.anfangszeit = anfangszeit;
	}
	
	public void setEndzeit(int endzeit){
		this.endzeit = endzeit;
	}
	
	public void setDauer(int dauer){
		this.dauer = dauer;
	}
	
	public int getZeitslotId(){
		return this.zeitslotId;
	}
	
	public int getWochentag(){
		return this.wochentag;
	}
	
	public int getAnfangszeit(){
		return this.anfangszeit;
	}
	
	public int getEndzeit(){
		return this.endzeit;
	}
	
	public int getDauer(){
		return this.dauer;
	}
	
	@Override
	public String toString(){
		String wochentagString;
        switch (wochentag) {
            case 1:  wochentagString = "Montag";
                     break;
            case 2:  wochentagString = "Dienstag";
                     break;
            case 3:  wochentagString = "Mittwoch";
                     break;
            case 4:  wochentagString = "Donnerstag";
                     break;
            case 5:  wochentagString = "Freitag";
                     break;
            case 6:  wochentagString = "Samstag";
                     break;
            default: wochentagString = "unbekannter Wochentag";
                     break;
        }
        return wochentagString +" "+this.anfangszeit+"-"+this.endzeit;
    }
}

