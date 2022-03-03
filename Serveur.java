import java.util.ArrayList;

public class Serveur {
    Port reception;
    GestionnaireConnexion gestionnaireConnexion;
    GestionnaireSecurite gestionnaireSecurite;
    SGBD sgbd;

    Lien requeteSQL;
    Lien requeteAutorisation;
    Lien requeteSecurite;

    ArrayList<Attachement> attachements;

    public Serveur(Port reception, GestionnaireConnexion gestionnaireConnexion,
            GestionnaireSecurite gestionnaireSecurite, SGBD sgbd, Lien requeteSQL, Lien requeteAutorisation,
            Lien requeteSecurite, ArrayList<Attachement> attachements) {
        this.reception = reception;
        this.gestionnaireConnexion = gestionnaireConnexion;
        this.gestionnaireSecurite = gestionnaireSecurite;
        this.sgbd = sgbd;
        this.requeteSQL = requeteSQL;
        this.requeteAutorisation = requeteAutorisation;
        this.requeteSecurite = requeteSecurite;
        this.attachements = attachements;
        
        
    }

    

}
