class Main {
    public static void main(String[] args) {
        // Test cases can be added here to validate the method's functionality.

        // Test case 1
        Object[] result1 = calculateBMI(170, 65); // height in cm, weight in kg
        System.out.println("BMI: " + result1[0] + ", Category: " + result1[1]);

        // Test case 2
        Object[] result2 = calculateBMI(180, 77); // height in cm, weight in kg
        System.out.println("BMI: " + result2[0] + ", Category: " + result2[1]);

        // Test case 3
        Object[] result3 = calculateBMI(190, 92); // height in cm, weight in kg
        System.out.println("BMI: " + result3[0] + ", Category: " + result3[1]);


    }

    // Create the calculateBMI Method here
}
