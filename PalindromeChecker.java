package LevelOneTasks;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Palindrome Checker---");
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();
        getPalindrome(word);
        scanner.close();
    }
    public static void getPalindrome(String word){
        word = word.toLowerCase().replaceAll("[^a-z]", "");
        String newWord = "";
        for(int i = word.length()-1; i>=0; i--) {
            newWord += word.charAt(i);
        }
        if(word.equals(newWord)) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}
