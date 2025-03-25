import java.util.Scanner;

public class ID_69A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrOfTest = input.nextInt();

        int x = 0;
        int y = 0;
        int z = 0;

        input.nextLine();
        for (int i = 0; i < nrOfTest; i++) {
            String cords[] = input.nextLine().split(" ");

            x += Integer.parseInt(cords[0]);
            y += Integer.parseInt(cords[1]);
            z += Integer.parseInt(cords[2]);

        }

        if (x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
