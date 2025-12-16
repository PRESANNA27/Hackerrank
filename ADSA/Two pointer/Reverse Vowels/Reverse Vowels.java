import java.util.*;

public class Solution {
    // Helper function to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    // Function to reverse only vowels in the string
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left until a vowel is found
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            // Move right until a vowel is found
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // Swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseVowels(s));
    }
}
