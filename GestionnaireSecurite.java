public class GestionnaireSecurite {
    String dbType;
    Port inputSecu;
    Port inputIdentifiants;

    public GestionnaireSecurite(String dbType, Port inputSecu, Port inputIdentifiants) {
        this.dbType = dbType;
        this.inputSecu = inputSecu;
        this.inputIdentifiants = inputIdentifiants;
    }
}
