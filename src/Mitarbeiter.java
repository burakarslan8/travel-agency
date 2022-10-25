//BURAK ARSLAN  200503051
public class Mitarbeiter extends Person{

    private String benutzername;
    private String passwort;

    public Mitarbeiter(String id,String n,String nn, int alt){
        super(id,n,nn,alt);
    }

    public Mitarbeiter(String id){
        super(id);
    }

    public String getBenutzername(){
        return benutzername;
    }

    public String getPasswort(){
        return passwort;
    }

    public void setBenutzername(String nick){
        benutzername=nick;
    }

    public void setPasswort(String psw){
        passwort=psw;
    }

}