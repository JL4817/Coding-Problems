import java.util.Scanner;

public class ID_1285A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int onlyL = 0;
        int onlyR = 0;
        String line = input.nextLine();
        for (int i = 0; i < n; i++) {
            if (line.charAt(i) == 'L') {
                onlyL++;
            } else if (line.charAt(i) == 'R') {
                onlyR++;
            }
        }
        System.out.println(onlyR + onlyL + 1);
        input.close();
    }
}
