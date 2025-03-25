import java.util.Scanner;

public class ID_58A {
    public static void main(String args[]) {
        final String HELLO = "hello";
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        int index = 0;

        for (char c : s.toCharArray()) {
            if (c == HELLO.charAt(index)) {
                index++;
                if (index == HELLO.length()) { // Wenn wir "hello" komplett gefunden haben
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");

    }
}
