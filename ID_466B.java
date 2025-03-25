import java.util.Scanner;

public class ID_466B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int s = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();

        // int smaller = Math.min(a, b);
        // int bigger = Math.max(a, b);

        int areaNeeded = 6 * s;
        int areaCurrent = a * b;

        // int difference = Math.abs(areaNeeded - areaCurrent);

        if (areaCurrent == areaNeeded) {
            System.out.println(areaCurrent);
            System.out.println(a + " " + b);
        } else {
            for (int i = b; i <= areaNeeded / a; i++) {
                int newB = i;
                int newArea = a * newB;

                if (newArea >= areaNeeded) {
                    System.out.println(newArea);
                    System.out.println(a + " " + newB);
                    break;
                }
            }
        }
    }
}
