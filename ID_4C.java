import java.util.HashMap;
import java.util.Scanner;

public class ID_4C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        // store the count of each base username
        HashMap<String, Integer> countsMap = new HashMap<>();

        for (int k = 0; k < n; k++) {
            String line = input.nextLine();

            if (countsMap.containsKey(line)) {
                // get next number for this username and increment counter
                int nextNum = countsMap.get(line);
                countsMap.put(line, nextNum + 1);
                System.out.println(line + nextNum);
            } else {
                // first occurrence of this username
                countsMap.put(line, 1);
                System.out.println("OK");
            }
        }
        input.close();
    }
}
