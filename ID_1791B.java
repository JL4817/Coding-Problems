import java.util.Scanner;

public class ID_1791B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();

        for (int i = 0; i < testCase; i++) {
            int commandLength = input.nextInt();
            input.nextLine();
            String commands = input.nextLine();
            int x = 0;
            int y = 0;
            boolean passes = false;

            for (char c : commands.toCharArray()) {
                if (c == 'U')
                    y++; // Move up
                else if (c == 'D')
                    y--; // Move down
                else if (c == 'L')
                    x--; // Move left
                else if (c == 'R')
                    x++; // Move right

                if (x == 1 && y == 1) {
                    passes = true;
                }
            }

            System.out.println(passes ? "YES" : "NO");

        }
        input.close();
    }
}
