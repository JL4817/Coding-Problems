import java.util.Scanner;

public class ID_1766A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int result = countExtremelyRound(n);
            System.out.println(result);
        }

        input.close();
    }

    private static int countExtremelyRound(int n) {
        String nStr = Integer.toString(n);
        int length = nStr.length();

        // For single digits (1-9), return n
        if (length == 1) {
            return n;
        }

        // Count all single digits (1-9)
        int count = 9;

        // For each length from 2 to length-1, add 9 (numbers like 10,20,...90,
        // 100,200,...,900)
        for (int i = 2; i < length; i++) {
            count += 9;
        }

        // For the current length, count extremely round numbers up to n
        int firstDigit = Character.getNumericValue(nStr.charAt(0));

        // Check if n itself is extremely round
        boolean isExtremelyRound = true;
        for (int i = 1; i < length; i++) {
            if (nStr.charAt(i) != '0') {
                isExtremelyRound = false;
                break;
            }
        }

        if (isExtremelyRound) {
            // If n is extremely round (like 2000), we count from 1000 to n
            count += firstDigit;
        } else {
            // If n is not extremely round (like 2345), we count from 1000 to
            // firstDigit*1000
            count += firstDigit;
        }

        return count;
    }
}