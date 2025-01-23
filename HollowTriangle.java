package prac_krish;

public class HollowTriangle{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars for the hollow pyramid
            for (int j = 0; j < 2 * i + 1; j++) {
                // Print '*' only for the first and last positions, or the last row
                if (j == 0 || j == 2 * i || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
