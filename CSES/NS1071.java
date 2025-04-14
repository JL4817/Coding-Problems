package CSES;

import java.util.Scanner;

public class NS1071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long x = input.nextLong();
            long y = input.nextLong();
            long group = Math.max(x, y) * Math.max(x, y);
            long groupsize = 2 * Math.max(x, y) - 1;
            long groupend = group - groupsize + 1;
            if (Math.max(x, y) % 2 == 1) { //odd
                if (x == Math.max(x, y)) { //then in row side
                    System.out.println(groupend + y - 1);
                } else { //then in column side
                    System.out.println(group - x + 1);
                }
            } else { //even
                if (x == Math.max(x, y)) { //then in row side
                    System.out.println(group - y + 1);
                } else { //then in column side
                    System.out.println(groupend + x - 1);
                }
            }
        }
        input.close();
    }
}
//Think of each as groups, for example, e.g. row 3 group goes until 9 from 5, 3 * 3