import java.util.Arrays;
import java.util.Scanner;

public class ID_500A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int target = input.nextInt(); //in 1 index
        input.nextLine();
        int[] array = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            array[i] = input.nextInt();
        }
        int currentPos = 0; //in 0 index
        boolean possible = false;
        while (currentPos < array.length) { //array length is n-1
            currentPos += array[currentPos];
            if (currentPos + 1 == target) {
                possible = true;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
        input.close();
    }
}
//Position number = Array index + 1
//Array index = Position number - 1
