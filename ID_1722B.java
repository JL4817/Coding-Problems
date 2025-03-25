import java.util.Scanner;

public class ID_1722B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numTest = input.nextInt();

        for (int i = 0; i < numTest; i++) {
            int numElements = input.nextInt();
            input.nextLine();
            String[] arr1 = input.nextLine().split("");
            String[] arr2 = input.nextLine().split("");
            boolean problem = false;

            for (int j = 0; j < numElements; j++) {
                if ((arr1[j].equals("R") && !arr2[j].equals("R")) || (!arr1[j].equals("R") && arr2[j].equals("R"))) {
                    problem = true;
                    break;
                }
            }
            if (problem) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }
        input.close();
    }
}
