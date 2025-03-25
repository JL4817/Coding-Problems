import java.util.Scanner;

public class ID_1950C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();

        while (t-- > 0) {
            String s = input.nextLine();
            int hh = Integer.parseInt(s.substring(0, 2));
            String mm = s.substring(3, 5);
            String period = (hh < 12) ? "AM" : "PM";

            hh = (hh % 12 == 0) ? 12 : hh % 12;

            System.out.println((hh < 10 ? "0" : "") + hh + ":" + mm + " " + period);
        }

        input.close();
    }
}
