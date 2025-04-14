import java.util.HashMap;
import java.util.Scanner;

public class ID_977B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        input.nextLine();
        String inputString = input.nextLine();

        if (length < 2) {
            System.out.println(0);
            input.close();
            return;
        }

        HashMap<String, Integer> stringMap = new HashMap<>();

        for (int i = 0; i < length - 1; i++) {
            String substring = inputString.substring(i, i + 2);
            stringMap.put(substring, stringMap.getOrDefault(substring, 0) + 1);
        }

        int maxValue = 0;
        String result = "";
        for (HashMap.Entry<String, Integer> entry : stringMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                result = entry.getKey();
            }
        }

        System.out.println(result);
        input.close();
    }
}

//inputString.substring(i, i + 2);extracts consecutive 2-character substrings:
//First iteration (i = 0): "AB"
//Second iteration (i = 1): "BA"
//Third iteration (i = 2): "AC"
//Fourth iteration (i = 3): "CA"
//Fifth iteration (i = 4): "AB"
//Sixth iteration (i = 5): "BA"
//stringMap.put(substring, stringMap.getOrDefault(substring, 0) + 1) does the following:
//
//getOrDefault(substring, 0) checks if the substring exists in the map
//
//If it exists, it returns its current count
//If it doesn't exist, it returns 0
//Then it adds 1 to that count and puts it back in the map
//So for the string "ABACABA", the final stringMap would look like:
//"AB": 2 times
//"BA": 2 times
//"AC": 1 time
//"CA": 1 time