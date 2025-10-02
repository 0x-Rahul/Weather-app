public class LargestElementInArray {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15, 25, 8};
        
        // Initialize 'largest' with the first element of the array
        int largest = numbers[0]; 
        
        // Iterate from the second element to the end of the array
        for (int i = 1; i < numbers.length; i++) {
            // If the current element is greater than the current 'largest', update 'largest'
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        
        System.out.println("The largest element in the array is: " + largest);
    }
}
