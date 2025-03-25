import java.util.HashMap;
import java.util.Scanner;

public class ID_236A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String arr[] = str.split("");

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (!(map.containsValue(arr[i]))) {
                map.put(i, arr[i]);
            }

        }

        int size = map.size();

        if (size % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }

}
