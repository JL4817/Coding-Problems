import java.util.Scanner;

public class ID_1987A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nrOfCase = input.nextInt();

        for (int n = 0; n < nrOfCase; n++) {

            int needed = input.nextInt();
            int perSec = input.nextInt();
            int totalRam = 0;
            int totalSeconds = 0;

            while (totalRam < needed) {
                if (totalSeconds % perSec == 0) {
                    totalRam++;
                }
                totalSeconds++;
            }
            System.out.println(totalSeconds);
        }
        input.close();
    }
}
