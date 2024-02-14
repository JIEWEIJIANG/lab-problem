public class TestProblem {
    public static void main(String[] args) {
            
        //problem1 test cases
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {10, 20, 30, 40, 50};

        // Test getLargest method
        System.out.println("Largest product for arr1: " + NewClass.getLargest(arr1, arr1.length));
        System.out.println("Largest product for arr2: " + NewClass.getLargest(arr2, arr2.length));
        System.out.println("Largest product for arr3: " + NewClass.getLargest(arr3, arr3.length));
    

        //problem 2 test cases
        // Initialize bags with M&Ms weights
        double[] bags = new double[20];
        for (int i = 0; i < 19; i++) {
            bags[i] = 1.0;  // Bags 1 to 19 have M&Ms of weight 1.0 gram
        }
        bags[19] = 1.1;  // Bag 20 has M&Ms of weight 1.1 gram

        // Total weight of expected M&Ms
        double totalExpectedWeight = 0;
        for (int i = 0; i < 20; i++) {
            totalExpectedWeight += (i + 1) * 1.0;  // Each bag contributes i+1 grams
        }

        // Total weight measured by the scale
        double totalMeasuredWeight = 0;
        for (int i = 0; i < 20; i++) {
            totalMeasuredWeight += bags[i];  // Accumulate the weights of all bags
        }

        // Find the difference to identify the heavy bag
        double extraWeight = totalMeasuredWeight - totalExpectedWeight;
        int heavyBagNumber = (int) Math.round(extraWeight);  // Round to nearest integer to get bag number

        // Output the result
        System.out.println("The bag with heavier M&Ms is bag number: " + heavyBagNumber);

    }
}
