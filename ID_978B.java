import java.util.Scanner;

public class ID_978B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int characterN = input.nextInt();
        String fileName = input.next();

        int count = 0;

        for (int i = 0; i < characterN - 2; i++) {
            if (fileName.charAt(i) == 'x' && fileName.charAt(i + 1) == 'x' && fileName.charAt(i + 2) == 'x') {
                count++;
            }
        }

        System.out.println(count);
        input.close();
    }
}
