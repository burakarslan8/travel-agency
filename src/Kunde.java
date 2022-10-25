//BURAK ARSLAN  200503051
import java.util.ArrayList;
public class Kunde extends Person {

    private String platznummer;
    private String anmeldungsdatum;
    private String kontostand;
    private static ArrayList pakete= new ArrayList();

    public Kunde(String id, String n, String nn, int alt, String kontostand) {
        super(id, n, nn, alt);
        this.kontostand=kontostand;
    }

    public Kunde(String id){
        super(id);
    }

    public String getPlatznummer() {
        return platznummer;
    }

    public String getDatum() {
        return anmeldungsdatum;
    }

    public String getKontostand() {
        return kontostand;
    }

    public int getPakete(int index){
        return (Integer) pakete.get(index);
    }

    public int getPaketeSize(){
        return pakete.size();
    }

    public void setPlatznummer(String platz) {
        platznummer = platz;
    }

    public void setDatum(String dat) {
        anmeldungsdatum = dat;
    }
    public void setKontostand(String ks){
        kontostand=ks;
    }

    public static void addPakete(int p_id){
        pakete.add(p_id);
    }

    @Override
    public String toString() {
        return (getID() + " " + getName() + " " + getNachname()+ " "+ getKontostand());
    }
}