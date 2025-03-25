import java.util.Scanner;

public class ID_791A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int limak = input.nextInt();
        int bob = input.nextInt();

        int year = 0;

        while (bob >= limak) {
            limak = limak * 3;
            bob = bob * 2;
            year++;
        }

        System.out.println(year);

    }

}
