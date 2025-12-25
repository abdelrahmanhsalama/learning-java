/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        String output = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= width) {
                    output += "*";
                }
                else {
                    output += "0";
                }
                if (j < n - 1) {
                    output = output + "  ";
                }
            }
            if (i < n - 1) {
                output += "\n";
            }
        }

        System.out.println(output);
    }
}
