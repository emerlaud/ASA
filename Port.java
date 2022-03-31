public class Port {

    Attachement attachement;
    Composant composant;

    public Port(Composant composant) {
        this.composant = composant;
    }

    public void send(String message) {
        System.out.println("Sending message: " + message);
        if (this.attachement != null) {
            this.attachement.role.lien.appele.attachement.port.receive(message);
        }
    }

    public void receive(String message){
        System.out.println("Message recu: " + message);
    }

}
