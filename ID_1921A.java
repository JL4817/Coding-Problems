import java.util.Scanner;

public class ID_1921A {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();
        input.nextLine();

        for (int i = 0; i < nTest; i++) {

            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;

            for (int j = 0; j < 4; j++) {

                String[] coord = input.nextLine().split(" ");
                int xValue = Integer.parseInt(coord[0]);
                int yValue = Integer.parseInt(coord[1]);

                minX = Math.min(minX, xValue);
                maxX = Math.max(maxX, xValue);

                minY = Math.min(minY, yValue);
                maxY = Math.max(maxY, yValue);
            }
            System.out.println((maxX - minX) * (maxY - minY));
        }
        input.close();
    }
}
