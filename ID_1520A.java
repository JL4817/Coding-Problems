import java.util.HashSet;
import java.util.Scanner;

public class ID_1520A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTest = input.nextInt();

        for (int i = 0; i < numTest; i++) {
            int numElements = input.nextInt();
            input.nextLine();
            String str = input.nextLine();

            boolean sus = false;
            boolean[] visited = new boolean[26];
            char previous = str.charAt(0); // Start with the first task
            visited[previous - 'A'] = true;

            for (int j = 0; j < numElements; j++) {
                char current = str.charAt(j);
                if (current != previous) {
                    if (visited[current - 'A'] == true) {
                        sus = true;
                        break;
                    }
                    visited[current - 'A'] = true;
                }
                previous = current;
            }
            System.out.println(sus == true ? "NO" : "YES");
        }
        input.close();
    }
}
