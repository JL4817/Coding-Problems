import java.util.Scanner;

public class ID_474A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String direction = input.nextLine();
        String line = input.nextLine();
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        StringBuilder originalMessage = new StringBuilder();

        int shift = (direction.equals("R")) ? -1 : 1;

        for (char c : line.toCharArray()) {
            int index = keyboard.indexOf(c);
            originalMessage.append(keyboard.charAt(index + shift));
        }

        System.out.println(originalMessage.toString());

        input.close();
    }
}
