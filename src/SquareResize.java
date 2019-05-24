import resizeable.Resizeable;
public class SquareResize extends Square implements Resizeable{
    public SquareResize() {
    }

    public SquareResize(double size) {
        super(size);
    }

    public SquareResize(double size, String color, boolean filled) {
        super(size, color, filled);
    }
    @Override
    public void resize(double percent){
        double sizeSquare = super.getSize();
        sizeSquare = sizeSquare*(percent/100);
        super.setSize(sizeSquare);
        super.getArea();
    }
}

