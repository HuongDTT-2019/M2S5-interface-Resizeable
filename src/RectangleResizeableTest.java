public class RectangleResizeableTest {
    public static void main(String[] args) {
        RectangleResizeable [] rectangleResizeables = new RectangleResizeable[3];
        double valPercent = Math.round(Math.random()*100);
        rectangleResizeables[0] = new RectangleResizeable(5,6);
        rectangleResizeables[1] = new RectangleResizeable(6,7);
        rectangleResizeables[2] = new RectangleResizeable(7,8);
        System.out.println("Pre - resize");
        for (RectangleResizeable rectangleResizeable : rectangleResizeables){
            System.out.println("Area: "+rectangleResizeable.getArea());
        }
        System.out.println("After - resize");
        for (RectangleResizeable rectangleResizeable : rectangleResizeables){
            rectangleResizeable.resize(valPercent);
            System.out.println("resize: "+valPercent+"% "+ "Area: "+rectangleResizeable.getArea());
        }
    }
}
