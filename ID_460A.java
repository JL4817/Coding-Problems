import java.util.Scanner;

public class ID_460A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int socksAmount = input.nextInt();
        int m = input.nextInt();
        int count = 0;
        while (socksAmount > 0) {
            socksAmount--;
            count++;

            if (count % m == 0) {
                socksAmount++;
            }
        }
        System.out.println(count);

        input.close();
    }
}
