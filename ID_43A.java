import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ID_43A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String team = input.nextLine();
            if (map.containsKey(team)) {
                map.put(team, map.get(team) + 1);
            } else {
                map.put(team, 1);
            }
        }

        int maxValue = Integer.MIN_VALUE;
        String maxTeam = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > maxValue) {
                maxValue = value;
                maxTeam = key;
            }
        }
        System.out.println(maxTeam);
        input.close();
    }
}
