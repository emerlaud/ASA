import java.util.Date;

public class SGBD {
    String dbType;
    Date startDate;
    Date lastExporDate;
    Port connExterne1;
    Port connExterne2;
    
    public SGBD(String dbType, Date startDate, Date lastExporDate, Port connExterne1, Port connExterne2) {
        this.dbType = dbType;
        this.startDate = startDate;
        this.lastExporDate = lastExporDate;
        this.connExterne1 = connExterne1;
        this.connExterne2 = connExterne2;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getLastExporDate() {
        return lastExporDate;
    }

    public void setLastExporDate(Date lastExporDate) {
        this.lastExporDate = lastExporDate;
    }    

}
