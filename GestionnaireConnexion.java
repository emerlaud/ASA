public class GestionnaireConnexion extends ComposantSimple{
    Port connExterne1;
    Port inputSecu;
    Port inpurSql;

    public GestionnaireConnexion() {
        this.connExterne1 = new Port(this);
        this.inputSecu = new Port(this);
        this.inpurSql = new Port(this);
    }
}
