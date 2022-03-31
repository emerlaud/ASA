public class Lien {
    Boolean utiliseTCP;
    Role appelant;
    Role appele;

    public Lien(Boolean utiliseTCP) {
        this.utiliseTCP = utiliseTCP;
        this.appelant = new Role(this);
        this.appele = new Role(this);
    }
}
