public class GestionnaireSecurite extends ComposantSimple {
    String dbType;
    Port inputSecu;
    Port inputIdentifiants;

    public GestionnaireSecurite() {
        this.dbType = "dbType";
        this.inputSecu = new Port(this);
        this.inputIdentifiants = new Port(this);
    }

    @Override
    public String handleMessage(String message) {
        return "";
    }
}
