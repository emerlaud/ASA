import java.util.List;

public abstract class Composite extends Composant {
    List<Composant> composants;

    public List<Composant> getComposants() {
        return composants;
    }

    public void setComposants(List<Composant> composants) {
        this.composants = composants;
    }
}
