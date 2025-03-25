import java.util.Scanner;

public class ID_630N {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String arr[] = input.nextLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        double formulaPlus = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double formulaNeg = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.println(Math.max(formulaPlus, formulaNeg));
        System.out.println(Math.min(formulaPlus, formulaNeg));

    }
}
