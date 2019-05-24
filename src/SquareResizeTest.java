public class SquareResizeTest {
    public static void main(String[] args) {
        SquareResize [] squareResizes = new SquareResize[3];
        squareResizes[0] = new SquareResize(5);
        squareResizes[1] = new SquareResize(7);
        squareResizes[2] = new SquareResize(9);
        System.out.println("Pre-resize:");
        for (SquareResize squareResize  : squareResizes){
            System.out.println("Area: "+squareResize.getArea());
        }
        System.out.println("After resize:");
        double valPercent = Math.round(Math.random()*100);
        for (SquareResize squareResize  : squareResizes){
            squareResize.resize(valPercent);
            System.out.println("resize: "+valPercent+"% "+ "Area: "+squareResize.getArea());
        }
    }
}
