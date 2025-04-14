import java.util.Scanner;

public class ID_1373B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            String s = input.next();
            int count0 = s.length() - s.replace("0", "").length();
            int count1 = s.length() - s.replace("1", "").length();

            System.out.println(Math.min(count0, count1) % 2 == 1 ? "DA" : "NET");
        }

        input.close();
    }
}