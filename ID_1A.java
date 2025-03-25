
import java.util.Scanner;

public class ID_1A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double m = input.nextDouble();
        double flag = input.nextDouble();
        // Math.ceil rounds up

        int length = (int) Math.ceil((double) n / flag);
        int width = (int) Math.ceil((double) m / flag);

        System.out.println((long) length * width);

    }

}
