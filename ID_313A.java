import java.util.Scanner;

public class ID_313A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int lengthOfNum = String.valueOf(num).length();
        int lastDigit = num % 10;
        int secondLastDigit = (num / 10) % 10;
        StringBuilder newSb = new StringBuilder(String.valueOf(num));

        if (num > 0) {
            System.out.println(num);
            return;
        } else if (num < 0) {
            if (lastDigit < secondLastDigit) {
                newSb.deleteCharAt(lengthOfNum - 1);
            } else {
                newSb.deleteCharAt(lengthOfNum - 2);
            }
        }

        System.out.println(newSb.toString().equals("-0") ? "0" : newSb.toString());
        input.close();
    }
}
/*
 * if positv: no delete
 * if negativ
 * 1. can only delete last or second to last
 * 
 * For example, if num = -123, lengthOfNum will be 4 (since "-123" has 4
 * characters), but the valid indexes are 0, 1, 2, and 3.
 */
