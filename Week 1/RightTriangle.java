public class RightTriangle {
    public static void main(String[] args) {
        int sideOne = Integer.parseInt(args[0]);
        int sideTwo = Integer.parseInt(args[1]);
        int sideThree = Integer.parseInt(args[2]);

        if (sideOne < 0 || sideTwo < 0 || sideThree < 0) {
            System.out.println("No sides can be negative.");
        }

        if (sideThree * sideThree == sideOne * sideOne + sideTwo * sideTwo) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}