public class NDouble implements Nombre<NDouble> {
    private double valeur;

    public NDouble() {
        valeur = 0;
    }

    public NDouble(double valeur) {
        this.valeur = valeur;
    }

    @Override
    public NDouble add(NDouble x) {
        return new NDouble(valeur + x.valeur);
    }

    @Override
    public NDouble sub(NDouble x) {
        return new NDouble(valeur - x.valeur);
    }

    @Override
    public NDouble mul(NDouble x) {
        return new NDouble(valeur * x.valeur);
    }

    @Override
    public NDouble div(NDouble x) {
        return new NDouble(valeur / x.valeur);
    }

    @Override
    public String toString() {
        return "NDouble{" +
                "valeur=" + valeur +
                '}';
    }
}
