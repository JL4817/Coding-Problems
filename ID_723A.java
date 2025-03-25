import java.util.Scanner;

public class ID_723A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int x3 = input.nextInt();

        int max = Math.max(Math.max(x1, x3), x2);
        int min = Math.min(Math.min(x1, x2), x3);

        System.out.println(max - min);

        /*
         * int mid = (x1 + x2 + x3) / 3;
         * 
         * if (mid == x1) {
         * int distance1 = mid - x2;
         * int distacne2 = mid - x3;
         * 
         * System.out.println(distacne2 + distance1);
         * } else if (mid == x2) {
         * int distance1 = mid - x1;
         * int distacne2 = mid - x3;
         * 
         * System.out.println(distacne2 + distance1);
         * 
         * } else if (mid == x3) {
         * int distance1 = mid - x2;
         * int distacne2 = mid - x1;
         * 
         * System.out.println(distacne2 + distance1);
         * 
         * }
         */
    }

}
