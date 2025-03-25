import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ID_5A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // input.nextLine();
        int personCount = 0;

        int overload = 0;

        HashSet<String> participants = new HashSet<>(); // A set to track people in the chat

        while (input.hasNextLine()) {

            String command = input.nextLine();
            // String nameAfter = command.substring(1);

            if (command.startsWith("+")) {

                // personCount++;
                String nameToAdd = command.substring(1);
                participants.add(nameToAdd);

            } else if (command.startsWith("-")) {

                // personCount--;
                String nameToAdd = command.substring(1);
                participants.remove(nameToAdd);

            } else {

                int index = command.indexOf(":");

                if (index != -1) {
                    String message = command.substring(index + 1);
                    int messLength = message.length();

                    overload += messLength * participants.size();
                }

            }
        }

        System.out.println(overload);

    }

}
