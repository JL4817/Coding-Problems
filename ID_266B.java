import java.util.Scanner;

public class ID_266B {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nrOfP = input.nextInt();
        int time = input.nextInt();

        input.nextLine();

        String students[] = input.nextLine().split("");

        for (int j = 0; j < time; j++) { // loop around the time, since the change happens to all each second

            for (int i = 0; i < nrOfP - 1; i++) {
                if (students[i].equals("B") && students[i + 1].equals("G")) {
                    students[i] = "G";
                    students[i + 1] = "B";
                    i++; // think visulaize it, why you need to do i++:
                }

            }
        }

        for (int a = 0; a < students.length; a++) {
            System.out.print(students[a]);
        }

    }

}
