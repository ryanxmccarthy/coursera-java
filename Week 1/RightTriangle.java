public class RightTriangle {
    public static void main(String[] args) {
        int sideOne = Integer.parseInt(args[0]);
        int sideTwo = Integer.parseInt(args[1]);
        int sideThree = Integer.parseInt(args[2]);

        boolean allSidesPositive = (sideOne > 0) && (sideTwo > 0) && (sideThree > 0);

        int squareOne = sideOne * sideOne;
        int squareTwo = sideTwo * sideTwo;
        int squareThree = sideThree * sideThree;

        boolean isRightTriangle = (squareOne + squareTwo == squareThree) && allSidesPositive;

        System.out.println(isRightTriangle);
    }
}