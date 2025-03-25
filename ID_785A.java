import java.util.Scanner;

public class ID_785A {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nrPoly = input.nextInt();

        input.nextLine();
        int count = 0;

        for (int i = 0; i < nrPoly; i++) {
            String shape = input.nextLine();

            if (shape.equals("Tetrahedron")) {
                count = count + 4;
            }

            if (shape.equals("Cube")) {
                count = count + 6;
            }

            if (shape.equals("Octahedron")) {
                count = count + 8;
            }

            if (shape.equals("Dodecahedron")) {
                count = count + 12;
            }

            if (shape.equals("Icosahedron")) {
                count = count + 20;
            }
        }

        System.out.println(count);

    }

}
