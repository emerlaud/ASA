import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        GestionnaireConnexion gestionnaireConnexion = new GestionnaireConnexion(new Port(), new Port(), new Port());
        GestionnaireSecurite gestionnaireSecurite = new GestionnaireSecurite("dbType", new Port(), new Port());
        SGBD sgbd = new SGBD("dbType", new Date(), new Date());

        Lien requeteSQL = new Lien(true, new Role(), new Role());
        Lien requeteAutorisation = new Lien(true, new Role(), new Role());
        Lien requeteSecurite = new Lien(true, new Role(), new Role());

        ArrayList<Attachement> attachements = new ArrayList<Attachement>();

        attachements.add(new Attachement(gestionnaireConnexion.inputSecu, requeteAutorisation.appelant));
        attachements.add(new Attachement(gestionnaireSecurite.inputSecu, requeteAutorisation.appele));

        attachements.add(new Attachement(gestionnaireConnexion.inpurSql, requeteSQL.appelant));
        attachements.add(new Attachement(sgbd.requeteSql, requeteSQL.appele));

        attachements.add(new Attachement(gestionnaireSecurite.inputIdentifiants, requeteSecurite.appelant));
        attachements.add(new Attachement(sgbd.requeteAutorisation, requeteSecurite.appele));
        System.out.println("All attachements created");

        Serveur serveur1 = new Serveur(new Port(), gestionnaireConnexion, gestionnaireSecurite, sgbd, requeteSecurite, requeteSecurite, requeteSecurite, attachements);
        System.out.println("Serveur created");
        Client client1 = new Client(new Port());
        System.out.println("Client created");

        Systeme system = new Systeme(client1, serveur1);
        System.out.println("System created");

    }

}
