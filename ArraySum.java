public class ArraySum {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Array = " + java.util.Arrays.toString(array));
        System.out.println("Sum of Array Elements = " + sum);
    }
}   