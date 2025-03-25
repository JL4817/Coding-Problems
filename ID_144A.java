import java.util.Scanner;

public class ID_144A {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int array[] = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = input.nextInt();

        }

        int maxIndex = 0;
        int minIndex = 0;

        for (int j = 0; j < num; j++) {
            if (array[j] > array[maxIndex]) {
                maxIndex = j;
            }

            if (array[j] <= array[minIndex]) {
                minIndex = j;
            }
        }
        // 5 4 6 7 8 1 2 max = 4, min = 5 7 - 5 - 1 = 1

        int count = maxIndex + (num - 1 - minIndex);

        if (maxIndex > minIndex) {
            count--; // If max is after min, then reduce the count by 1
            // this is becuase when the max moves, it changes, the amount of steps the min
            // has to do to get to the end is different
        }

        System.out.println(count);

    }
}
