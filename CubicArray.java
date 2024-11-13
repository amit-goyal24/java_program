public class CubicArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Array = " + java.util.Arrays.toString(array));
        System.out.print("Cubic Array Elements =");

        for (int i = 0; i < array.length; i++) {
            int cubic = (int) Math.pow(array[i], 3);
            System.out.print(" " + cubic);
        }
    }
}