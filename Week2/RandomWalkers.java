import java.util.Random;

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int x = 0;
        int y = 0;

        Random rand = new Random();
        int randomDirection;
        int steps = 0;

        for (int i = 0; i < trials; i++) {
            x = 0;
            y = 0;

            while ((Math.abs(x) + Math.abs(y)) < r) {
                randomDirection = rand.nextInt(4);

                switch (randomDirection) {
                    case 0:
                        y += 1;
                        break;
                    case 1:
                        y -= 1;
                        break;
                    case 2:
                        x += 1;
                        break;
                    case 3:
                        x -= 1;
                }
                steps++;
            }
        }
        System.out.println("Average number of setps = " + ((float) steps / trials));
    }
}