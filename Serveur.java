import java.util.ArrayList;

public class Serveur extends Composite {
    String name;
    Port reception;
    GestionnaireConnexion gestionnaireConnexion;
    GestionnaireSecurite gestionnaireSecurite;
    SGBD sgbd;

    Lien requeteSQL;
    Lien requeteAutorisation;
    Lien requeteSecurite;

    ArrayList<Attachement> attachements;

    public Serveur(String name) {
        this.name = name;
        this.reception = new Port(this);
        gestionnaireConnexion = new GestionnaireConnexion();
        gestionnaireSecurite = new GestionnaireSecurite();
        sgbd = new SGBD();

        requeteSQL = new Lien(true);
        requeteAutorisation = new Lien(true);
        requeteSecurite = new Lien(false);

        attachements = new ArrayList<Attachement>() {
            {
                // requeteAutorisation
                add(new Attachement(gestionnaireConnexion.inputSecu, requeteAutorisation.appelant));
                add(new Attachement(gestionnaireSecurite.inputSecu, requeteAutorisation.appele));

                // requeteSQL
                add(new Attachement(gestionnaireConnexion.inpurSql, requeteSQL.appelant));
                add(new Attachement(sgbd.requeteSql, requeteSQL.appele));

                // requeteSecurite
                add(new Attachement(gestionnaireSecurite.inputIdentifiants, requeteSecurite.appelant));
                add(new Attachement(sgbd.requeteAutorisation, requeteSecurite.appele));
            }
        };
        System.out.println("Serveur cree");
    }

    public String toString() {
        return this.name;
    }
}
