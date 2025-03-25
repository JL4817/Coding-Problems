import java.util.HashSet;
import java.util.Scanner;

public class ID_1703B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testNr = input.nextInt();

        for (int i = 0; i < testNr; i++) {
            int nrSolved = input.nextInt();
            input.nextLine();
            String[] strArr = input.nextLine().split("");
            HashSet<String> solvedQ = new HashSet<>();
            int totalBalloons = 0;

            for (int j = 0; j < nrSolved; j++) {

                if (solvedQ.contains(strArr[j])) {
                    totalBalloons++;
                } else {
                    totalBalloons += 2;
                    solvedQ.add(strArr[j]);
                }
            }
            System.out.println(totalBalloons);
        }
        input.close();
    }
}
