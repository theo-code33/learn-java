package learnJava;

public class Mur extends Bloc{
    private boolean loadBearing;

    Mur(final int length, final int width, final int height, final boolean loadBearing) {
        super(length, width, height);
        this.loadBearing = loadBearing;
        this.color = Couleur.GREY;
    }

    public boolean isTraversable() {
        return !loadBearing;
    }
}
