public class sumofarray {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
            int sum = 0;
            for (int element : array) {
                sum += element;
            }
    
            System.out.println("Sum of array elements: " + sum);
        }
    }
