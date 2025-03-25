import java.util.ArrayList;
import java.util.Scanner;

public class ID_746B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int amount = scanner.nextInt();
        int amount = 4;
        String ans = "";
        char str[] = "abba".toCharArray();
        // String str[] = scanner.nextLine().split("");
        ArrayList<Character> list = new ArrayList<>();
        // THERE IS TO CHARARRAY

        for (int i = 0; i < amount; i++) {
            list.add(str[i]);
        }

        for (int i = 0; i < amount; i++) {
            if (list.size() == 1) {
                ans = ans + list.get(0);
                list.remove(0);
            } else if (list.size() % 2 == 0) {
                ans = ans + list.get(list.size() / 2);
                list.remove(list.size() / 2);
            } else {
                ans = ans + list.get(list.size() / 2);
                list.remove(list.size() / 2);

            }
        }

        System.out.println(ans);

    }
}
