import java.util.ArrayList;
import java.util.List;

public class Systeme {
    Client client;
    Serveur serveur;
    Lien lien1;
    List<Attachement> attachements;

    public Systeme(Client client, Serveur serveur) {
        this.client = client;
        this.serveur = serveur;
        this.lien1 = new Lien(true);

        this.attachements = new ArrayList<Attachement>() {
            {
                add(new Attachement(client.port, lien1.appelant));
                add(new Attachement(serveur.reception, lien1.appele));
            }
        };
        System.out.println(this);
    }

    public String toString() {
        return "Systeme en ligne compose de '" + client.toString() + "' et de '" + serveur.toString() + "'\n";
    }
}
