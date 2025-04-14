import java.util.Scanner;

public class ID_379A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(recursiveSolve(a, 0, b));
        input.close();
    }

    // a: current candles to burn
    // remainder: leftover burned candles from previous steps
    // b: number of burned candles needed to make a new one
    private static int recursiveSolve(int a, int remainder, int b) {
        int hours = a;
        // Total burned candles = newly burned + leftover from before
        int totalBurned = a + remainder;
        // Calculate new candles from burned ones
        int newCandles = totalBurned / b;
        // Calculate remaining burned candles that couldn't be recycled
        int newRemainder = totalBurned % b;
        if (newCandles > 0) {
            hours += recursiveSolve(newCandles, newRemainder, b);
        }
        return hours;
    }
}