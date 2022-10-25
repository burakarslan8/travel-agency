//BURAK ARSLAN  200503051
import java.util.Date;
import java.text.SimpleDateFormat;

public class Reisepaket {
    private int paket_ID;
    private Date startdatum = new Date();
    private Date enddatum = new Date();
    private String destination;
    private int anzahl_tage;

    public Reisepaket(int paket_ID, Date startdatum, Date enddatum, String destination, int anzahl_tage){
        this.paket_ID = paket_ID;
        this.startdatum = startdatum;
        this.enddatum = enddatum;
        this.destination = destination;
        this.anzahl_tage = anzahl_tage;
    }

    public Reisepaket(int paket_ID){
        this.paket_ID=paket_ID;
    }

    public int getPaket_ID(){
        return paket_ID;
    }

    public String getStartdatum(){
        SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");
        return format.format(startdatum);
    }
    public String getEnddatum(){
        SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");
        return format.format(enddatum);
    }
    public String getDestination(){
        return destination;
    }
    public int getAnzahl_tage(){
        return anzahl_tage;
    }


    public void setPaket_ID(int paket_ID){
        this.paket_ID=paket_ID;
    }
    public void setStartdatum(Date startdatum){
        this.startdatum=startdatum;
    }
    public void setEnddatum(Date enddatum){
        this.enddatum=enddatum;
    }
    public void setDestination(String destination){
        this.destination=destination;
    }
    public void setAnzahl_tage(int anzahl_tage){
        this.anzahl_tage=anzahl_tage;
    }

    @Override
    public String toString(){
        return getPaket_ID() + " " + getStartdatum() + " " + getEnddatum() + " " + getDestination() + " " + getAnzahl_tage();
    }
    public static boolean checkPaket_ID(int pid){
        if(Integer.toString(pid).charAt(0)=='1'){
            return true;
        }
        else{
            throw new InvalidIDException("Falsche Eingabe. Die PaketID-Nummer soll mit 1 anfangen.");
        }
    }

    @Override
    public boolean equals(Object o){
        if(((Reisepaket)o).getPaket_ID() == this.getPaket_ID()){
            return true;
        }
        else{
            return false;
        }
    }
}
