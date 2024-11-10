public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;

        System.out.println("Array = " + java.util.Arrays.toString(array));
        System.out.println("Average of Array Value : " + average);
    }
}