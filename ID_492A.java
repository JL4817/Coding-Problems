import java.util.Scanner;

public class ID_492A {
    public static void main(String args[]) {
        // cumulative sum or triangular sum series.

        Scanner input = new Scanner(System.in);
        int givenBlocks = input.nextInt();
        // int givenBlocks = 25;
        int countLayer = 0; // counts nr of layers
        int totalCount = 0; // total cubes used
        int layerSize = 1;

        while (totalCount + layerSize <= givenBlocks) {
            totalCount += layerSize;
            countLayer++;
            layerSize += countLayer + 1;
        }
        System.out.println(countLayer);
    }
}
