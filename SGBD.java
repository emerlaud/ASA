import java.util.Date;

public class SGBD extends ComposantSimple {
    String dbType;
    Date startDate;
    Date lastExporDate;
    Port requeteAutorisation;
    Port requeteSql;

    public SGBD() {
        this.dbType = "dbType";
        this.startDate = new Date();
        this.lastExporDate = new Date();
        this.requeteAutorisation = new Port(this);
        this.requeteSql = new Port(this);
    }

    @Override
    public String handleMessage(String message) {
        System.out.println("Execution de la requete ....\n");
        return "id|Name 1|Sam 2|Elyne";
    }
}
