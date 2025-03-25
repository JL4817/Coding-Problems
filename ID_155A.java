import java.util.ArrayList;
import java.util.Scanner;

public class ID_155A {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int nrCase = input.nextInt();

        ArrayList<Integer> elements = new ArrayList<>();

        int best = 0;
        int worst = 0;
        int count = 0;

        for (int i = 0; i < nrCase; i++) {

            int competition = input.nextInt();

            elements.add(competition);
        }

        best = elements.get(0);
        worst = elements.get(0);

        for (int j = 0; j < elements.size(); j++) {

            if (elements.get(j) > best) {
                count++;
                best = elements.get(j);

            } else if (elements.get(j) < worst) {
                count++;
                worst = elements.get(j);

            }
        }

        System.out.println(count);
        input.close();

    }

}
