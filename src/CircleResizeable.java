import resizeable.Resizeable;

public class CircleResizeable extends Circle implements Resizeable {
    public CircleResizeable(){

    }

    public CircleResizeable(double radius) {
        super(radius);
    }

    public CircleResizeable(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    @Override
    public void resize(double percent){
      double circleRadius = super.getRadius();
        circleRadius = circleRadius*(percent/100);
        super.setRadius(circleRadius);
        super.getArea();
    }
}
