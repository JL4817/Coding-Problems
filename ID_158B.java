import java.util.Scanner;

public class ID_158B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count4 = 0, count3 = 0, count2 = 0, count1 = 0;

        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            if (num == 4)
                count4++;
            else if (num == 3)
                count3++;
            else if (num == 2)
                count2++;
            else if (num == 1)
                count1++;
        }

        int totalCount = 0;

        // Groups of 4 need their own taxis
        totalCount += count4;

        // Pair groups of 3 with groups of 1
        int pairs3And1 = Math.min(count3, count1);
        totalCount += pairs3And1;
        count3 -= pairs3And1;
        count1 -= pairs3And1;

        // Remaining groups of 3 need separate taxis
        totalCount += count3;

        // Pair groups of 2 together
        totalCount += count2 / 2;
        if (count2 % 2 == 1) {
            // If one group of 2 is left, it can pair with up to 2 groups of 1
            totalCount++;
            count1 -= Math.min(count1, 2);
        }

        // Remaining groups of 1 need taxis
        totalCount += (count1 + 3) / 4;

        System.out.println(totalCount);
        input.close();
    }
}
