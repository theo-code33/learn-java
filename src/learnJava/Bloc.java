package learnJava;

public abstract class Bloc implements IBloc {
    protected int length;
    protected int width;
    protected int height;
    protected Couleur color;

    Bloc(final int length, final int width, final int height) throws IllegalBlocException {
        if(length < MIN_LENGTH || width < MIN_WIDTH || height < MIN_HEIGHT) {
            throw new IllegalBlocException("Impossible de construire le bloc.");
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setColor(Couleur color) {
        this.color = color;
    }
}
