import java.util.HashSet;
import java.util.Scanner;

public class ID_520A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int nr = input.nextInt();
        input.nextLine();

        String str = input.nextLine().toLowerCase();
        HashSet<Character> alp = new HashSet<>();

        for (int i = 0; i < nr; i++) {
            alp.add(str.charAt(i));
        }

        if (alp.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
