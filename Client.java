public class Client extends ComposantSimple {
    Port port;
    String name;

    public Client(String name) {
        this.name = name;
        this.port = new Port(this);
        System.out.println("Client cree");
    }

    public String toString() {
        return this.name;
    }

    public void sendRequest(String message) {
        this.port.send(message);
    }

    @Override
    public String handleMessage(String message) {
        System.out.println("Le client a bien recu le message " + message + "\n");
        return "";
    }
}
