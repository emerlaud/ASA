import java.util.Date;

public class SGBD {
    String dbType;
    Date startDate;
    Date lastExporDate;
    Port requeteAutorisation;
    Port requeteSql; 
    
    public SGBD(String dbType, Date startDate, Date lastExporDate) {
        this.dbType = dbType;
        this.startDate = startDate;
        this.lastExporDate = lastExporDate;
    }
    
}
