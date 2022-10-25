//BURAK ARSLAN  200503051
public abstract class Person extends Reisebuero{

    private String name;
    private String nachname;
    private int alter;
    private String adresse;
    private String telefonnummer;
    private String id_nummer;

    public Person(String id,String n, String nn, int alt) {
        id_nummer = id;
        name = n;
        nachname = nn;
        alter = alt;
    }

    public Person(String id){
        id_nummer=id;
    }

    public String getName(){
        return name;
    }

    public String getNachname(){return nachname; }

    public int getAlter(){
        return alter;
    }

    public String getAdresse(){
        return adresse;
    }

    public String getNummer(){
        return telefonnummer;
    }

    public String getID(){
        return id_nummer;
    }

    public void setName(String n){
        name=n;
    }

    public void setNachname(String nn){ nachname=nn; }

    public void setAlter(int alt){
        alter=alt;
    }

    public void setAdresse(String adr){
        adresse=adr;
    }

    public void setTelefonnummer(String tel){
        telefonnummer=tel;
    }

    public void setID(String id){
        id_nummer=id;
    }

    @Override
    public String toString(){
        return (getID()+" "+ getName() + " "+ getNachname());
    }

    public static boolean checkID(String id){
        if(id.charAt(0) == '0'){
            throw new InvalidIDException("Falsche Eingabe. Die ID-Nummer darf nicht mit 0 anfangen. Versuchen Sie es bitte erneut.");
        }
        for (int i=0; i<id.length();i++){
            if(id.length() != 7){
                throw new InvalidIDException("Falsche Eingabe. Die ID-Nummer soll eine genau 7-stellige Nummer sein. Versuchen Sie es bitte erneut.");
            }
            else if(!Character.isDigit(id.charAt(i))){
                throw new InvalidIDException("Falsche Eingabe. Die ID-Nummer soll aus Ziffern bestehen. Versuchen Sie es bitte erneut.");
            }
        }
        return true;
    }
    @Override
    public boolean equals(Object o){
        if(((Person)o).getID().equals(this.getID())){
            return true;
        }
        else{
            return false;
        }

    }
}