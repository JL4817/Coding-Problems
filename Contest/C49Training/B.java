package Contest.C49Training;

import java.util.Scanner;

public class B {

    // 1 sticker no toy
    // no sticker 1 toy
    // both sticker and toy

    // What is the minimum number of Kinder Surprise Eggs you have to buy to be sure
    // that, whichever types they are, you'll obtain at least one sticker and at
    // least one toy?

    // 10 5 7
    // 10 eyggs
    // 5 stickers (5 no stickers)
    // 7 toys (3 no toys)
    // 6 ()

    // 22 5 6

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();
        int[] arr = new int[nTest];
        for (int n = 0; n < nTest; n++) {

            int numEgg = input.nextInt();
            int numSticker = input.nextInt();
            int numToy = input.nextInt();
            if (numEgg == numToy && numToy == numSticker) {
                arr[n] = 1;
            } else if (numSticker < numToy) {
                arr[n] = (numEgg - numSticker) + 1;
            } else if (numToy < numSticker) {
                arr[n] = (numEgg - numToy) + 1;
            } else if (numToy == numSticker) {
                arr[n] = (numEgg - numSticker) + 1;
            }

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        input.close();
    }
}