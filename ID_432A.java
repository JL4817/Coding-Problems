import java.util.Scanner;

public class ID_432A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrOfStudents = input.nextInt();
        int k = input.nextInt();

        int possibleParti = 5 - k;
        input.nextLine();
        int count = 0;

        for (int i = 0; i < nrOfStudents; i++) {
            if (input.nextInt() <= possibleParti) {
                count++;
            }
        }

        System.out.println(count / 3);
    }
}
