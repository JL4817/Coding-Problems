import java.util.HashMap;
import java.util.Scanner;

public class ID_268A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Read number of teams
        int n = input.nextInt();

        // Initialize a 2D array to store home and guest uniform colors for each team
        int[][] uniforms = new int[n][2];

        // Read home and guest uniform colors for each team
        for (int i = 0; i < n; i++) {
            uniforms[i][0] = input.nextInt(); // home uniform color
            uniforms[i][1] = input.nextInt(); // guest uniform color
        }

        // Initialize a counter for the number of games where the host wears the guest
        // uniform
        int guestUniformCount = 0;

        // Loop through each game and check the uniform color conditions
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (uniforms[i][0] == uniforms[j][1]) { // host's home color matches guest's guest color
                        guestUniformCount++;
                    }
                }
            }
        }

        // Output the result
        System.out.println(guestUniformCount);

        // Close the scanner
        input.close();

    }

}