package erste;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        //Anruf 1
        boolean anna = isPalindrome("Anna");
        System.out.println(anna);
        //Anruf 2
        System.out.println(isPalindrome("Anna2"));
    }

    public static boolean isPalindrome(String potntialPalindrome) {
        potntialPalindrome = potntialPalindrome.toLowerCase();
        potntialPalindrome = potntialPalindrome.replace("'", "");
        potntialPalindrome = potntialPalindrome.replace(",", "");
        potntialPalindrome = potntialPalindrome.replace(" ", "");

        char firstLetter = potntialPalindrome.charAt(0);
        char lastLetter = potntialPalindrome.charAt(potntialPalindrome.length() - 1);


        if (firstLetter == lastLetter) {
            potntialPalindrome = potntialPalindrome.substring(1, potntialPalindrome.length() - 1);

            if (potntialPalindrome.length() <= 1) {

                return true;
            }
            return isPalindrome(potntialPalindrome);
        }
        return false;
    }
}
