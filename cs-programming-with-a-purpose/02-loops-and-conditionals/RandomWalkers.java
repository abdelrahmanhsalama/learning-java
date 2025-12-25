/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double steps = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;

            while (Math.abs(x) + Math.abs(y) < r) {
                int dir = (int) (Math.random() * 4);

                if (dir == 0) x++;
                else if (dir == 1) x--;
                else if (dir == 2) y++;
                else y--;

                steps++;
            }
        }

        System.out.println("average number of steps = " + steps / trials);
    }
}
