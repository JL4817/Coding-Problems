package CSES;

import java.util.Scanner;

public class R1069 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dna = input.nextLine();
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < dna.length(); i++) {
            if (dna.charAt(i) == dna.charAt(i - 1)) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        System.out.println(maxLength);
        input.close();
    }
}
