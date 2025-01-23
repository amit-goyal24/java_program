// public class arrpro {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 25, 30};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element: " + max);
    }
}
