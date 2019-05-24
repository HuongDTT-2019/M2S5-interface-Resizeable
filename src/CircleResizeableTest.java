public class CircleResizeableTest {
    public static void main(String[] args) {
        CircleResizeable [] circleResizeables = new CircleResizeable[3];
        double valPercent = Math.round(Math.random()*100);
        circleResizeables[0] = new CircleResizeable(5);
        circleResizeables[1] = new CircleResizeable(6);
        circleResizeables[2] = new CircleResizeable(7);
        System.out.println("Pre - resize");
        for (CircleResizeable circleResizeable : circleResizeables){
            System.out.println("Area: "+circleResizeable.getArea());
        }
        System.out.println("After - resize");
        for (CircleResizeable circleResizeable : circleResizeables){
            circleResizeable.resize(valPercent);
            System.out.println("resize: "+valPercent+"% "+ "Area: "+circleResizeable.getArea());
        }
    }
}
