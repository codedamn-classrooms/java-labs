class Main {

    public static void main(String[] args) {
        // Testing the countSteps method with the specified test cases
        int result;

        // Test with number 7
        result = countSteps(7);
        System.out.println("Steps for 7: " + result + " (Expected: 16)");

        // Test with number 6
        result = countSteps(6);
        System.out.println("Steps for 6: " + result + " (Expected: 8)");

        // Test with number 16
        result = countSteps(16);
        System.out.println("Steps for 16: " + result + " (Expected: 4)");

        // Test with number 1
        result = countSteps(1);
        System.out.println("Steps for 1: " + result + " (Expected: 0)");
    }


    public static int countSteps(int n) {
       // Write your code here
    }
}
