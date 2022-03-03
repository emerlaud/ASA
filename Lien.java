public class Lien {
    Boolean utiliseTCP;
    Role appelant;
    Role appele;

    public Lien(Boolean utiliseTCP, Role appelant, Role appele) {
        this.utiliseTCP = utiliseTCP;
        this.appelant = appelant;
        this.appele = appele;
    }

        
}
