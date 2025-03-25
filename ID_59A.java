import java.util.Scanner;

public class ID_59A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String array[] = s.split("");
        int lower = 0;
        int upper = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(array[i].toLowerCase())) { // lowercase
                lower++;
            } else {
                upper++;
            }
        }

        if (lower > upper) {
            System.out.println(s.toLowerCase());
        } else if (upper > lower) {
            System.out.println(s.toUpperCase());
        } else if (upper == lower) {
            System.out.println(s.toLowerCase());
        }

    }

}
