public class revserarray {
   
        public static void main(String[] args) {
            // Sample array
            int[] originalArray = {1, 2, 3, 4, 5};
    
            // Call the method to reverse the array
            int[] reversedArray = reverseArray(originalArray);
    
            // Print the reversed array
            System.out.print("Reversed Array: ");
            for (int num : reversedArray) {
                System.out.print(num + " ");
            }
        }
    
        // Method to reverse the array
        public static int[] reverseArray(int[] array) {
            int n = array.length;
            int[] reversed = new int[n];
    
            // Reverse the array
            for (int i = 0; i < n; i++) {
                reversed[i] = array[n - 1 - i];
            }
    
            return reversed;
        }
    }
    
    

