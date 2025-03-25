import java.util.Scanner;

public class ID_387A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String curr = input.nextLine();
        // String curr = "05:50";
        String dur = input.nextLine();

        // went to bed + dur = curr
        // went to bed = curr - dur

        String currArr[] = curr.split(":");
        int currH = Integer.parseInt(currArr[0]);
        int currM = Integer.parseInt(currArr[1]);

        String durArr[] = dur.split(":");
        int durH = Integer.parseInt(durArr[0]);
        int durM = Integer.parseInt(durArr[1]);

        // Subtract the sleep duration from the current time
        int bedHour = currH - durH;
        int bedMinute = currM - durM;

        // Adjust the hour and minute if they are negative
        if (bedMinute < 0) {
            bedHour--;
            bedMinute += 60;
        }
        if (bedHour < 0) {
            bedHour += 24;
        }

        // If bedMinute is less than 0, it means we need to borrow an hour from the
        // bedHour
        // and adjust the minute value accordingly.
        // We decrement bedHour by 1 to represent borrowing an hour,
        // and then add 60 to bedMinute to wrap around to the correct minute value.

        // If bedHour is less than 0, it means we need to wrap around to the previous
        // day.
        // We add 24 to bedHour to wrap around to the correct hour value.

        // Format the output time
        String bedTime = String.format("%02d:%02d", bedHour, bedMinute);
        System.out.println(bedTime);
    }

}
