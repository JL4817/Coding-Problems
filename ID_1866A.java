import java.util.Arrays;
import java.util.Scanner;

public class ID_1866A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nElements = input.nextInt();
        input.nextLine();
        int[] array = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).map(Math::abs).toArray();
        Arrays.sort(array);
        System.out.println(array[0]);
        input.close();
    }
}
