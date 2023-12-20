
class Main {
    public static void main(String[] args) {
        // Example test cases
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] result1 = commonElements(array1, array2);
        printArray(result1); // Expected: []

        int[] array3 = {1, 2, 3, 4};
        int[] array4 = {3, 4, 5, 6};
        int[] result2 = commonElements(array3, array4);
        printArray(result2); // Expected: [3, 4]
    }

    // Utility method to print arrays for testing
    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Create the "commonElements" method here
    public static int[] commonElements() {}
}
