public class ArrayAscendingOrder {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 9};

        // Find Maximum and Minimum
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element = " + max);
        System.out.println("Minimum element = " + min);

        // Bubble Sort in Ascending Order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print Sorted Array
        System.out.print("Array in Ascending Order: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
