package main.problems;

public class PlusOne {
    public int[] plusOne(int[] digits){
        int n = digits.length; // n = 3
        for (int i = n - 1; i >= 0; i--) { // Start from the last digit
            if (digits[i] < 9) { // Check if the digit is less than 9
                digits[i]++; // Increment the digit
                return digits; // Return the result as no carry is needed
            }
            digits[i] = 0; // Set the digit to 0 as it's 9 and will carry over
        }

        // If the loop finishes, then all the digits were 9 and have carried over to a new digit
        int[] newNumber = new int[n + 1]; // Create a new array with an extra digit
        newNumber[0] = 1; // Set the first digit to 1 as the result is a power of 10
        return newNumber; // Return the new number array
    }
}
