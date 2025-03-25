import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class ID_118A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String vowels = "aoyeui";
        str = str.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            // -1 when nothing is found
            if (vowels.indexOf(c) == -1) {
                result.append(".").append(c);
            }
        }

        System.out.println(result.toString());

    }
}
