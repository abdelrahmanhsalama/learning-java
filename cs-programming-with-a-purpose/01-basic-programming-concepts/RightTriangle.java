/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        boolean result = x > 0 && y > 0 && z > 0 && ((x * x + y * y == z * z) || (x * x + z * z == y * y) || (y * y + z * z == x * x));
        System.out.println(result);
    }
}
