public class RightTriangle {
    public static void main(String[] args) {
        int sideOne = Integer.parseInt(args[0]);
        int sideTwo = Integer.parseInt(args[1]);
        int sideThree = Integer.parseInt(args[2]);

        int squareOne = sideOne * sideOne;
        int squareTwo = sideTwo * sideTwo;
        int squareThree = sideThree * sideThree;

        System.out.println(squareOne + squareTwo == squareThree);
    }
}