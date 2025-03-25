import java.util.HashSet;
import java.util.Scanner;

public class ID_1791A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrOfTestCase = input.nextInt();

        HashSet<Character> map = new HashSet<>();
        map.add('c');
        map.add('o');
        map.add('d');
        map.add('e');
        map.add('f');
        // map.add('o');
        map.add('r');
        map.add('c');
        // map.add('e');
        map.add('s');

        input.nextLine();
        for (int i = 0; i < nrOfTestCase; i++) {
            if (map.contains(input.next().charAt(0))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        input.close();
    }
}
