import java.util.Scanner;

public class ID_705A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int layer = input.nextInt();

        String hulkSay = "";

        for (int i = 1; i <= layer; i++) {
            if (i % 2 != 0) {
                hulkSay = hulkSay + "I hate ";
            } else if (i % 2 == 0) {
                hulkSay = hulkSay + "I love ";
            }

            // Add "that" for all layers except the last one
            if (i != layer) {
                hulkSay = hulkSay + "that ";
            }
        }

        hulkSay = hulkSay + "it";
        System.out.println(hulkSay);
    }

}
