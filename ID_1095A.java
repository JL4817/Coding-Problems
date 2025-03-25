import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ID_1095A {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        int nrString = scanner.nextInt(); // 10
        String phrase = scanner.nextLine(); // ooopppssss
        String arrPh[] = phrase.split(""); // O O O p p p s s s s
        String answer = "";
        int count = 0;

        for (int i = 0; i < nrString; i++) {

            for (int j = 0; j < arrPh.length; j++) {
                if (i == count) {
                    answer = answer + arrPh[i];
                }
                count++;
            }

        }

        for (Map.Entry<Integer, String> entry : hash.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

    }

}
