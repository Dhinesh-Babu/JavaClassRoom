package Anagrams;

import java.util.Scanner;

public class Drive {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String A1 = input.nextLine();
        String A2 = input.nextLine();
        A1 = A1.replaceAll(" ","");
        A2 = A2.replaceAll(" ","");
        if( A1.length() != A2.length() ) {
            throw new ArithmeticException("Not Same Length");
        }
        char[] A1Char = A1.toCharArray();
        char[] A2Char = A2.toCharArray();
        for(int i = 0; i<A1Char.length; i++) {
            if( A2.indexOf(A1Char[i]) == -1)
                throw new Exception("Not An Anagram "+A1Char[i]+" Not Found.");
        }
        System.out.println("Anagrams");
    }
}
