import java.util.*;

public class ID_230A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kStrength = input.nextInt();
        int dragonN = input.nextInt();

        // Store dragons in array for sorting
        int[][] dragons = new int[dragonN][2];
        for (int i = 0; i < dragonN; i++) {
            dragons[i][0] = input.nextInt(); // strength
            dragons[i][1] = input.nextInt(); // bonus
        }

        // Sort dragons by strength
        Arrays.sort(dragons, (a, b) -> a[0] - b[0]);

        // defeat dragons in order of increasing strength
        for (int[] dragon : dragons) {
            if (kStrength <= dragon[0]) {
                System.out.println("NO");
                return;
            }
            kStrength += dragon[1];
        }

        System.out.println("YES");
        input.close();
    }
}