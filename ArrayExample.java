public class ArrayExample {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] numbers;

        // Initialize the array with a specific size (e.g., 5)
        numbers = new int[5];

        // Assign values to array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Access and print array elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Calculate the sum of array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);

        // Declare and initialize an array in one line
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Fig"};

        // Access and print elements of the string array
        System.out.println("String array elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}