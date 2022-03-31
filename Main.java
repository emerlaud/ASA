public class Main {
    public static void main(String[] args) {
        Serveur serveur1 = new Serveur("Serveur 1");
        Client client1 = new Client("Cient 1");
        Systeme systeme = new Systeme(client1, serveur1);

        client1.sendRequest("SGBD: select * from db");
        client1.sendRequest("requete invalide");
        System.out.println("Tout fonctionne !");
    }
}
