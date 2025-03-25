import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ID_443A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        String result[] = line.replaceAll("[^a-zA-Z]", "").split("");
        HashSet<String> hash = new HashSet<String>();

        for (int i = 0; i < result.length; i++) {

            hash.add(result[i]);

        }

        if (line.equals("{}")) {
            System.out.println(0);
        } else if (!(hash.isEmpty())) {
            System.out.println(hash.size());
        }

    }

}
