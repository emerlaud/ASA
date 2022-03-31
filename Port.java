public class Port {

    Attachement attachement;
    Composant composant;

    public Port(Composant composant) {
        this.composant = composant;
    }

    public void send(String message) {
        if (this.attachement != null) {
            Port targetPort;
            String role;
            Role inputRole = this.attachement.role;
            Lien upLink = inputRole.lien;
            if (inputRole.equals(upLink.appelant)) {
                targetPort = upLink.appele.attachement.port;
                role = "Envoi";
            } else {
                targetPort = upLink.appelant.attachement.port;
                role = "Reponse";
            }
            System.out.println(role + " du message: '" + message + "' de " + composant);

            targetPort.receive(message);
        }
    }

    public void receive(String message) {
        System.out.println("Message recu: '" + message + "' pour " + composant);
        this.composant.handleMessage(message);
    }
}
