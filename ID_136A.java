import java.util.HashMap;
import java.util.Scanner;

public class ID_136A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nrFriends = input.nextInt();

        input.nextLine();

        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nrFriends; i++) {
            hash.put(i, input.nextInt()); // number original, need to print out number
        }

        for (int j = 1; j <= hash.size(); j++) {
            for (int i = 0; i < hash.size(); i++) {
                if (j == hash.get(i)) {
                    System.out.print(i + 1 + " ");
                    break;
                }
            }

        }

    }

}