import java.util.Date;

public class SGBD {
    String dbType;
    Date startDate;
    Date lastExporDate;
    
    public SGBD(String dbType, Date startDate, Date lastExporDate) {
        this.dbType = dbType;
        this.startDate = startDate;
        this.lastExporDate = lastExporDate;
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
