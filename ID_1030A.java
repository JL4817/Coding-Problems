import java.util.Scanner;

public class ID_1030A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        input.nextLine();
        String people[] = input.nextLine().split(" ");

        boolean hard = false;
        int countEasy = 0;

        for (int i = 0; i < amount; i++) {
            if (people[i].equals("1")) {
                hard = true;
            } else if (people[i].equals("0")) {
                countEasy++;
            }
        }

        if (hard == true) {
            System.out.println("HARD");
        } else if (countEasy == amount) {
            System.out.println("EASY");
        }

    }

}
