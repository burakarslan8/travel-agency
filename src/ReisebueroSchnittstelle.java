//BURAK ARSLAN  200503051
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface ReisebueroSchnittstelle {

    public void addKunde(Kunde k);
    public void addMitarbeiter(Mitarbeiter m);
    public void addReisepaket(Reisepaket rp) throws ParseException;

    public void removeKunde(String id);
    public void removeMitarbeiter(String id);
    public void removeReisepakete(int rp_id);

    public Kunde getKunde(String id);
    public Mitarbeiter getMitarbeiter(String id);
    public Reisepaket getReisepaket(int id);

    public void printKunden();
    public void printMitarbeiter();
    public void printAlleReisepakete();
    public void printAktuelleReisepakete();

    public void verkaufeReisepaket(String kunde_id, int rp_id);

    public static Date toDate(String s) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date d = format.parse(s);
        return d;
    }
}