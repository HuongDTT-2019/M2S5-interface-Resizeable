import resizeable.Resizeable;
public class RectangleResizeable extends Rectangle implements Resizeable{
    public RectangleResizeable() {
    }

    public RectangleResizeable(double width, double length) {
        super(width, length);
    }

    public RectangleResizeable(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }
    @Override
    public void resize (double percent){
        double rectangleWidth = super.getWidth();
        double rectangleLength = super.getLength();
        rectangleWidth = rectangleWidth*(percent/100);
        rectangleLength = rectangleLength*(percent/100);
        super.setWidth(rectangleWidth);
        super.setLength(rectangleLength);
        super.getArea();
    }

}
