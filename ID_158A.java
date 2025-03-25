import java.util.Scanner;

public class ID_158A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();
        String stringA[] = line.split(" ");
        int count = 0;
        int total = 0;

        // int numberOfPeople = Integer.parseInt(stringA[0]);
        int ithPlace = Integer.parseInt(stringA[1]);

        String scoreEarned[] = input.nextLine().split(" ");

        int earnedScore = Integer.parseInt(scoreEarned[ithPlace - 1]);

        for (int i = 0; i < scoreEarned.length; i++) {

            total = total + Integer.parseInt(scoreEarned[i]);

            if (Integer.parseInt(scoreEarned[i]) >= earnedScore && Integer.parseInt(scoreEarned[i]) > 0) {
                count++;
            }
        }

        if (total == 0) {
            System.out.println(0);
        } else {
            System.out.println(count);
        }

    }

}
