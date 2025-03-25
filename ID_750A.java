import java.util.Scanner;

public class ID_750A {

    public static void main(String[] args) {

        // contest: 4 hours, 20:00 starts
        // every question add 5 min

        Scanner input = new Scanner(System.in);
        int nrOfProblem = input.nextInt();
        int durationToParty = input.nextInt();
        int difficulty = 5;
        int countdown = 240;
        int nrSolved = 0;

        for (int i = 0; i < nrOfProblem; i++) {

            if (countdown - (difficulty + durationToParty) >= 0) {
                countdown -= difficulty;
                nrSolved++;
                difficulty = difficulty + 5;
            }

        }

        System.out.println(nrSolved);
        input.close();

    }

}
