import java.util.Scanner;

public class ID_282A {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int amount = input.nextInt();
        input.nextLine();

        int count = 0;
        String plus1 = "X++";
        String plus2 = "++X";

        for (int i = 0; i < amount; i++) {
            String line = input.nextLine();

            if (line.equals(plus1) || line.equals(plus2)) {
                count++;
            } else {
                count--;
            }

        }

        System.out.println(count);

    }

}
