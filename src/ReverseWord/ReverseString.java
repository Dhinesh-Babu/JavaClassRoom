package ReverseWord;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Sentence = input.nextLine();
        String[] words = Sentence.split(" ");
        String[] reverse = new String[words.length];
        for(int i = 0; i <words.length; i++) {
            reverse[i] = "";
           for(int j = words[i].length() - 1; j >= 0; j--)
               reverse[i] = reverse[i] + words[i].charAt(j);
           System.out.print(reverse[i]+" ");
        }
    }
}
