package Qn4;

public class StringManipulator {

    // Method to reverse a string
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Method to convert a string to uppercase
    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        return cleanedInput.equals(new StringBuilder(cleanedInput).reverse().toString());
    }

    // Method to count vowels in a string
    public int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
