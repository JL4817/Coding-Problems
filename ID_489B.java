import java.util.Arrays;
import java.util.Scanner;

public class ID_489B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int boyNum = input.nextInt();
        input.nextLine();
        int[] boyArr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int girlNum = input.nextInt();
        input.nextLine();
        int[] girlArr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(boyArr);
        Arrays.sort(girlArr);

        int count = 0;
        for (int i = 0; i < boyNum; i++) {
            for (int j = 0; j < girlNum; j++) {
                if (boyArr[i] == (girlArr[j] - 1) || boyArr[i] == girlArr[j] || boyArr[i] == (girlArr[j] + 1)) {
                    count++;
                    boyArr[i] = -1;
                    girlArr[j] = -1;
                }
            }
        }
        System.out.println(count);
        input.close();
    }
}
/*
 * InputCopy
 * 4
 * 1 4 6 2
 * 5
 * 5 1 5 7 9
 * OutputCopy
 * 3
 * 
 * 1 2 4 6
 * 1 5 5 7 9
 * 
 * 2d array? each going through, if its same or 1 diff, then count++?
 * 
 * sorting always finds the most closest match first, which maximizes the number
 * of valid pairs
 */
