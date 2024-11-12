package learnJava;

public class Porte extends Bloc {

    private boolean lock;

    Porte(final int length, final int width, final int height, final boolean lock) {
        super(length, width, height);
        this.lock = lock;
        this.color = Couleur.BLUE;
    }

    public boolean isLock() {
        return lock;
    }
}
