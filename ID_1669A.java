import java.util.Scanner;

public class ID_1669A {

    public static void main(String[] args) {

        // For Division 1: 1900≤rating
        // For Division 2: 1600≤rating≤1899
        // For Division 3: 1400≤rating≤1599
        // For Division 4: rating≤1399

        Scanner input = new Scanner(System.in);
        int nrOfTestCase = input.nextInt();

        for (int i = 0; i < nrOfTestCase; i++) {
            int rating = input.nextInt();

            if (1900 <= rating) {
                System.out.println("Division 1");
            } else if (1600 <= rating && rating <= 1899) {
                System.out.println("Division 2");
            } else if (1400 <= rating && rating <= 1599) {
                System.out.println("Division 3");
            } else if (rating <= 1399) {
                System.out.println("Division 4");
            }
        }

        input.close();
    }

}
