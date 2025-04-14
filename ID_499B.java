import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class ID_499B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //lecture length
        int m = input.nextInt(); //language length
        input.nextLine();
        HashMap<String, String> map = new HashMap<>();
        String total = "";
        for (int i = 0; i < m; i++) {
            String[] line = input.nextLine().split(" ");
            String langauge1 = line[0];
            String langauge2 = line[1];
            if (langauge1.length() == langauge2.length()) {
                map.put(langauge1, langauge1);
            } else if (langauge1.length() > langauge2.length()) {
                map.put(langauge1, langauge2);
            } else { //language1 is shorter
                map.put(langauge1, langauge1);
            }
        }
        String[] lecture = input.nextLine().split(" ");
        for (int j = 0; j < n; j++) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (lecture[j].equals(entry.getKey())) {
                    total += entry.getValue() + " ";
                }
            }
        }
        System.out.println(total);
        input.close();
    }
}
