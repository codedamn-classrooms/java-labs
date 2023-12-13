class Main {
    public static void main(String[] args) {
        // Test cases
        System.out.println(compressString("aaabbc")); // Expected Output: a3b2c1
        System.out.println(compressString("abcd"));   // Expected Output: a1b1c1d1
        System.out.println(compressString("zzzzz"));  // Expected Output: z5
        System.out.println(compressString("!@##$%")); // Expected Output: !1@1#2$1%1
    }

    public static String compressString(String input) {
        // Write your code here
    }
}
