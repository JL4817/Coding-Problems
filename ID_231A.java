import java.util.Scanner;

public class ID_231A {

    public static void main(String[] args) {

        int overall = 0;

        Scanner input = new Scanner(System.in);
        int nProblems = input.nextInt();
        input.nextLine();

        for (int i = 0; i < nProblems; i++) {

            String line = input.nextLine();
            String array[] = line.split(" ");

            int add = Integer.parseInt(array[0]) + Integer.parseInt(array[1]) + Integer.parseInt(array[2]);

            if (add >= 2) {
                overall++;
            }

        }

        System.out.println(overall);

    }
}