import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ID_228A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int c1 = input.nextInt();
        int c2 = input.nextInt();
        int c3 = input.nextInt();
        int c4 = input.nextInt();

        HashSet<Integer> hash = new HashSet<Integer>();

        hash.add(c1);
        hash.add(c2);
        hash.add(c3);
        hash.add(c4);

        System.out.println(4 - hash.size());

    }

}
