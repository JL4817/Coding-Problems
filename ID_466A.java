import java.util.Scanner;

public class ID_466A {
    public static void main(String[] args) {
        /*
         * Input
         * 6 2 1 2
         * Output
         * 6
         * 
         * Input
         * 5 2 2 3
         * 2 ride = 3 euro, also 1 ride = 3/2 = 1.5
         * 1 ride 2 euro
         * Output
         * 8
         */
        Scanner input = new Scanner(System.in);
        int numberOfRidesNeeded = input.nextInt();
        int numberOfRidesBySpecial = input.nextInt();
        int price1Ride = input.nextInt();
        int priceSpeicalRide = input.nextInt();

        int totalRideSoFar = 0;
        int totalEuro = 0;
        while (totalRideSoFar < numberOfRidesNeeded) {
            // price per ride
            double priceSpecial = (double) priceSpeicalRide
                    / Math.min(numberOfRidesNeeded - totalRideSoFar, numberOfRidesBySpecial);
            double priceNormal = price1Ride;

            if (priceSpecial > priceNormal) {
                if (!(totalRideSoFar > numberOfRidesNeeded)) {
                    totalRideSoFar += 1;
                    totalEuro += price1Ride;
                }
            } else {
                if (!(totalRideSoFar > numberOfRidesNeeded)) {
                    totalRideSoFar += numberOfRidesBySpecial;
                    totalEuro += priceSpeicalRide;
                }
            }
        }

        System.out.println(totalEuro);

        input.close();
    }
}
/*
 * bezahlts 5 bekommt 5
 * aber wenn es nur 1's 2 gibt, preis ist nicht 5/5 sondern. 5/2, nicht alle 5
 * ist nötig
 * ich bezahle mehr als ich brauche
 */
