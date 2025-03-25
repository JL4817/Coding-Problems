import java.util.Scanner;

public class ID_703A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrOfRounds = input.nextInt();
        input.nextLine();
        int countM = 0;
        int countC = 0;

        for (int i = 0; i < nrOfRounds; i++) {
            int mRoll = input.nextInt();
            int cRoll = input.nextInt();

            if (mRoll > cRoll) {
                countM++;
            } else if (mRoll < cRoll) {
                countC++;
            }
        }

        if (countM > countC) {
            System.out.println("Mishka");
        } else if (countM < countC) {
            System.out.println("Chris");
        } else if (countM == countC) {
            System.out.println("Friendship is magic!^^");
        }
    }
}
