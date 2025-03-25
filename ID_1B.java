import java.util.ArrayList;
import java.util.Scanner;

public class ID_1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        ArrayList<String> result = new ArrayList<>();
        for (int testCase = 0; testCase < n; testCase++) {
            String line = input.nextLine();
            if (line.charAt(0) == 'R') {
                result.add(rxcySystemToOther(line));
            } else {
                result.add(otherTorxcySystem(line));
            }
        }
        for (String answer : result) {
            System.out.println(answer);
        }
        input.close();
    }

    // 55: AA = 11, AB = 12, BC = 23
    private static String rxcySystemToOther(String line) { // R23C55 -> BC23
        String result = "";
        String[] positions = line.split("\\d+");
        String row = positions[0]; // 23, the numebr can be larger than 2 digits
        String col = positions[1]; // 55

        String[] alphabet = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

        for (int i = 0; i < row.length(); i++) { // 23 done
            String r = String.valueOf(row.charAt(i));
            int index = Integer.parseInt(r);
            result += alphabet[index];
        }

        return result;
    }

    private static String otherTorxcySystem(String line) {
        return "hello2";
    }
}
/*
 * Input
 * R23C55
 * BC23
 * Output
 * BC23
 * R23C55
 */
