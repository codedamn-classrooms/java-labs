class Main {
    public static void main(String[] args) {
        // Test cases
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {15, 20, 25};
        int[] array3 = {12, 18};
        int[] emptyArray = {};
        int[] singleElementArray = {5};

        System.out.println("LCM of [1, 2, 3, 4]: " + calculateLCM(array1));
        System.out.println("LCM of [15, 20, 25]: " + calculateLCM(array2));
        System.out.println("LCM of [12, 18]: " + calculateLCM(array3));
        System.out.println("LCM of []: " + calculateLCM(emptyArray));
        System.out.println("LCM of [5]: " + calculateLCM(singleElementArray));
    }

    public static int calculateLCM(int[] array) {
        // Write your code here
    }
}
