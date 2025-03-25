import java.util.Scanner;

public class ID_467A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nrOfRooms = input.nextInt();

        input.nextLine();

        int count = 0;

        for (int i = 0; i < nrOfRooms; i++) {
            int livingInRoom = input.nextInt();
            int roomCapacity = input.nextInt();

            if ((roomCapacity - livingInRoom) >= 2) {
                count++;
            }

        }

        System.out.println(count);

    }

}
