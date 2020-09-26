public class RandomWalker {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;
        double r;

        int steps = 0;
        while (x * x + y * y <= N * N) {
            steps++;
            r = Math.random();
            if (r <= 0.25)
                x++;
            else if (r <= 0.50)
                x--;
            else if (r <= 0.75)
                y++;
            else if (r <= 1.00)
                y--;
        }

        System.out.println(steps);
    }

}