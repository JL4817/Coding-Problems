import java.util.Scanner;

public class ID_1850B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int i = 0; i < nTest; i++) {
            int nPlayer = input.nextInt();
            int[] wordsArr = new int[nPlayer];
            int[] qualityArr = new int[nPlayer];
            int qualityMaxValue = 0;
            int qualityMaxIndex = 0;

            for (int j = 0; j < nPlayer; j++) {
                int numWords = input.nextInt();
                int quality = input.nextInt();

                wordsArr[j] = numWords;
                qualityArr[j] = quality;

                if ((qualityArr[j] > qualityMaxValue) && !(wordsArr[j] > 10)) {
                    qualityMaxValue = qualityArr[j];
                    qualityMaxIndex = j;
                }
            }
            System.out.println(qualityMaxIndex + 1);
        }
        input.close();
    }
}
