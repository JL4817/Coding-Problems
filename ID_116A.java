import java.util.Scanner;

public class ID_116A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int nrOfStops = input.nextInt();
        int maxCapacity = 0;
        int currentCapacity = 0;

        // Read the newline character after reading nrOfStops
        input.nextLine();

        for (int i = 0; i < nrOfStops; i++) {
            String arr[] = input.nextLine().split(" ");
            int numExit = Integer.parseInt(arr[0]);
            int numArrive = Integer.parseInt(arr[1]);
            currentCapacity = currentCapacity - numExit + numArrive;
            maxCapacity = Math.max(maxCapacity, currentCapacity);
        }

        System.out.println(maxCapacity);

    }

}
