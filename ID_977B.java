import java.util.Scanner;

public class ID_977B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        input.nextLine();
        String line = input.nextLine();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        boolean correct = false;

        for (int i = 1; i <= line.length(); i++) {
            if (line.charAt(i) == line.charAt(i + 1)) {
                System.out.println(line.charAt(i) + line.charAt(i + 1));
                correct = true;
            }
        }

        if (correct == false) {
            int index = 0;
            for (char c : alphabet.toCharArray()) {
                if (line.charAt(index) == c) {
                    if (line.charAt(0) == alphabet.charAt(index + 1)) {
                        result += line.charAt(0) + alphabet.charAt(index + 1);
                    }
                }
                index++;
            }
            System.out.println(result);
        }

        input.close();
    }
}
