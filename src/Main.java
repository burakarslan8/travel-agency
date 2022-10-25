//BURAK ARSLAN  200503051
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
public class Main{

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        Reisebuero rb = new Reisebuero();

        int operation = 0;
        String id;
        String name;
        int alter;
        String nn; //nachname
        String ks; //Kontostand
        int p_id; //paket_ID
        Date startdatum1;
        Date enddatum1;
        String dest; //destination
        int an_tag; //Anzahl der Tage
        try {
            while (operation != 100) {

                System.out.println("Welche Operation möchten Sie durchführen?");
                System.out.println("  1- Mitarbeiter hinzufügen");
                System.out.println("  2- Mitarbeiter auflisten");
                System.out.println("  3- Mitarbeiter löschen");
                System.out.println("  4- Kunde hinzufügen");
                System.out.println("  5- Kunden auflisten");
                System.out.println("  6- Kunde löschen");
                System.out.println("  7- Reisepaket hinzufügen");
                System.out.println("  8- Reisepakete auflisten");
                System.out.println("  9- Reisepaket löschen");
                System.out.println(" 10- Reisepaket an Kunden verkaufen");
                System.out.println(" 11- Reisepakete vom Kunden auflisten");
                System.out.println("100- Programm beenden");

                operation = sc.nextInt();
                switch (operation) {
                    case 1:
                        /* TODO */
                        // a) Fragen Sie den Benutzer nach den Mitarbeiterinformationen
                        System.out.println("Geben Sie bitte Mitarbeiterinformationen(id, name, nachname, alter) ein.");

                        // b) Lesen Sie die Information mit sc.nextLine() und wenn notwendig mit sc.nextInt() ein.
                        id = sc.next();

                        if (Person.checkID(id)) {
                            name = sc.next();
                            nn = sc.next();
                            alter = sc.nextInt();

                            // c) Erstellen Sie eine Instanz Ihrer Klasse "Mitarbeiter" mit diesen Informationen
                            Mitarbeiter m = new Mitarbeiter(id, name, nn, alter);
                            // d) Speichern Sie diese Instanz in der Liste Mitarbeiter mit mitarbeiter.add()
                            rb.addMitarbeiter(m);
                        }
                        break;
                    case 2:

                        rb.printMitarbeiter();
                        break;
                    case 3:
                        System.out.println("Geben Sie bitte die ID-Nummer des zu löschenden Mitarbeiters ein.");
                        String id_n = sc.next();

                        rb.removeMitarbeiter(id_n);
                        break;
                    case 4:
                        // TODO
                        //a) Fragen Sie den Benutzer nach den Kundeninformationen
                        System.out.println("Geben Sie bitte Kundeninformationen(id, name, nachname, alter, kontostand) ein.");

                        //b) Lesen Sie die Information mit sc.nextLine() und wenn notwendig mit sc.nextInt() ein
                        id = sc.next();

                        if (Person.checkID(id)) {
                            name = sc.next();
                            nn = sc.next();
                            alter = sc.nextInt();
                            ks = sc.next();

                            //c) Erstellen Sie eine Instanz Ihrer Klasse "Kunde" mit diesen Informationen
                            Kunde k = new Kunde(id, name, nn, alter, ks);
                            //d) Speichern Sie diese Instanz in der Liste Kunden*/
                            rb.addKunde(k);
                        }
                        break;
                    case 5:

                        rb.printKunden();
                        break;
                    case 6:
                        System.out.println("Geben Sie bitte die ID-Nummer des zu löschenden Kunden ein.");
                        String id_n1 = sc.next();

                        rb.removeKunde(id_n1);
                        break;
                    case 7:
                        System.out.println("Geben Sie bitte Reisepaketinformationen(paket_ID, startdatum, enddatum, destination, anzahl der Tage) ein.");
                        p_id = sc.nextInt();
                        if(Reisepaket.checkPaket_ID(p_id)){
                            startdatum1 = ReisebueroSchnittstelle.toDate(sc.next());
                            enddatum1 = ReisebueroSchnittstelle.toDate(sc.next());
                            dest = sc.next();
                            an_tag = sc.nextInt();

                            Reisepaket r = new Reisepaket(p_id, startdatum1, enddatum1, dest, an_tag);

                            rb.addReisepaket(r);
                        }
                        break;
                    case 8:

                        rb.printAktuelleReisepakete();
                        break;
                    case 9:
                        System.out.println("Geben Sie bitte die Paket-ID des zu löschenden Reisepakets ein.");
                        int p_id1 = sc.nextInt();

                        rb.removeReisepakete(p_id1);
                        break;
                    case 10:
                        System.out.println("Geben Sie bitte die ID-Nummer des Kunden.");
                        String id_k = sc.next();
                        System.out.println("Geben Sie bitte die Paket-ID des Reisepakets.");
                        int pid = sc.nextInt();

                        rb.verkaufeReisepaket(id_k,pid);
                        break;
                    case 11:
                        System.out.println("Geben Sie bitte die ID-Nummer des Kunden.");
                        String id_a = sc.next();

                        rb.getPaketeVomKunden(id_a);
                        break;
                }
            }
        }
        catch(InvalidIDException i){
            System.out.println(i.getMessage());
        }
    }
}