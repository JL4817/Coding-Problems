import java.util.Scanner;

public class ID_263A {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int[][] array = new int[5][5]; // Assuming the input is a 5x5 array

        for (int i = 0; i < 5; i++) {
            String line = input.nextLine(); // adding each elements into the 2d array
            String[] values = line.split(" ");

            for (int j = 0; j < 5; j++) {
                array[i][j] = Integer.parseInt(values[j]);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (array[i][j] == 1) { // finding 1
                    int moves = Math.abs(i - 2) + Math.abs(j - 2); // calculating the distance, the middle is [3][3]
                    System.out.println(moves); // the reason for subtracing by 2 and not 3 is beucase it starts at 0,
                                               // arrays.
                }

            }
        }

    }

}
