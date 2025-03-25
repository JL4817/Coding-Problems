import java.util.Scanner;

public class ID_1283A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nr = input.nextInt();

        for (int i = 0; i < nr; i++) {
            // String time = input.nextLine();
            // String hour = time.substring(0, 2);
            // String minute = time.substring(3, 5);

            int hour = input.nextInt();
            int minute = input.nextInt();

            // int beforeHour = 24 - Integer.parseInt(hour);

            // int beforeMinute = 60 - Integer.parseInt(minute);

            int beforeHour = 24 - (hour);

            int beforeMinute = 60 - (minute);

            System.out.println((beforeHour - 1) * 60 + beforeMinute);

        }
    }

}
