//BURAK ARSLAN  200503051
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Reisebuero implements ReisebueroSchnittstelle {

    private ArrayList<Kunde> kunden = new ArrayList();
    private ArrayList<Mitarbeiter> mitarbeiter = new ArrayList();
    private ArrayList<Reisepaket> reisepakete= new ArrayList();
    private ArrayList<Reisepaket> aktuelle_reisepakete= new ArrayList();

    public void addKunde(Kunde k){
        kunden.add(k);
    }

    public void addMitarbeiter(Mitarbeiter m){
        mitarbeiter.add(m);
    }

    public void addReisepaket(Reisepaket rp) throws ParseException {
        Date heute= new Date();
        if(ReisebueroSchnittstelle.toDate(rp.getStartdatum()).after(heute)){
            aktuelle_reisepakete.add(rp);
        }
        reisepakete.add(rp);
    }

    public void removeKunde(String id){
        kunden.remove(new Kunde(id));
    }

    public void removeMitarbeiter(String id){
        mitarbeiter.remove(new Mitarbeiter(id));
    }

    public void removeReisepakete(int rp_id){
        reisepakete.remove(new Reisepaket(rp_id));
        aktuelle_reisepakete.remove(new Reisepaket(rp_id));
    }

    public Kunde getKunde(String id){
        if(kunden.contains(new Kunde(id))){
            return new Kunde(id);
        }
        else{
            return null;
        }
    }

    public Mitarbeiter getMitarbeiter(String id){
        if(mitarbeiter.contains(new Mitarbeiter(id))){
            return new Mitarbeiter(id);
        }
        else{
            return null;
        }
    }

    public Reisepaket getReisepaket(int rp_id){
        if(reisepakete.contains(new Reisepaket((rp_id)))){
            return new Reisepaket(rp_id);
        }
        else{
            return null;
        }
    }

    public void printKunden(){
        for(int i=0;i<kunden.size();i++){
            System.out.println(kunden.get(i));
        }
    }
    public void printMitarbeiter(){
        for(int i=0;i<mitarbeiter.size();i++){
            System.out.println(mitarbeiter.get(i));
        }
    }
    public void printAlleReisepakete(){
        for(int i=0;i<reisepakete.size();i++){
            System.out.println(reisepakete.get(i));
        }
    }
    public void printAktuelleReisepakete(){
        for(int i=0;i<aktuelle_reisepakete.size();i++){
            System.out.println(aktuelle_reisepakete.get(i));
        }
    }

    public void verkaufeReisepaket(String kunde_id, int rp_id){
        for(int i = 0; i< kunden.size();i++){
            Kunde k = kunden.get(i);
            for(int j=0; j<reisepakete.size();j++){
                Reisepaket r = reisepakete.get(j);
                if(kunde_id.equals(k.getID()) && rp_id==r.getPaket_ID()){
                    Kunde.addPakete(rp_id);
                }
            }
        }
    }
    public void getPaketeVomKunden(String id){
        for(int j=0; j<reisepakete.size();j++){
            Reisepaket r = reisepakete.get(j);
            for(int l=0; l< getKunde(id).getPaketeSize();l++){
                if(id.equals(getKunde(id).getID()) && r.getPaket_ID()==getKunde(id).getPakete(l)){
                    System.out.println(reisepakete.get(j));
                }
            }
        }
    }
}
