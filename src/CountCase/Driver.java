package CountCase;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char[] arr = word.toCharArray();
        int tot=0,up=0,low=0,dig=0,spec=0;
        for (char c : arr) {
            if (Character.isLowerCase(c))
                low++;
            else if (Character.isDigit(c))
                dig++;
            else if (Character.isUpperCase(c))
                up++;
            else
                spec++;
        }
        tot = up+low+dig+spec;
        System.out.println((up*100/tot)+"\n"+(low*100/tot)+"\n"+(dig*100/tot)+"\n"+(spec*100/tot));
    }
}
