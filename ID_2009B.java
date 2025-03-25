import java.util.ArrayList;
import java.util.Scanner;

public class ID_2009B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();

        for (int i = 0; i < nTest; i++) {
            int n = input.nextInt();
            input.nextLine();
            ArrayList<Integer> arrlist = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                String[] line = input.nextLine().split("");
                for (int k = 0; k < 4; k++) {
                    if (line[k].equals("#")) {
                        arrlist.add((k + 1));
                    }
                }
            }
            for (int j = arrlist.size() - 1; j >= 0; j--) {
                System.out.print(arrlist.get(j) + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
