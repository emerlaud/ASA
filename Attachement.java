public class Attachement {
    Port port;
    Role role;

    public Attachement(Port port, Role role) {
        this.port = port;
        this.role = role;
        // port.attachement is defined
        this.port.attachement = this;
        this.role.attachement = this;
    }
}
