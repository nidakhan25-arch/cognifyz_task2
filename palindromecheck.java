import java.util.Scanner;

public class palindromecheck
{


    public static boolean isPalindrome(String str) {

        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        int length = cleanedStr.length();
        for (int i = 0; i < length / 2; i++)
        {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(length - 1 - i))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();


        if (isPalindrome(input))
        {
            System.out.println("The input is a palindrome.");
        }
        else
        {
            System.out.println("The input is not a palindrome.");
        }

        scanner.close();
    }
}