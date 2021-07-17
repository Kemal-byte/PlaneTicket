import reservation.airlines.PegasusReservationSystem;
import reservation.airlines.THYReservationSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of the seats inside the plane.");
        int koltuksayisi = scanner.nextInt();
        THYReservationSystem thy = new THYReservationSystem(koltuksayisi);
        PegasusReservationSystem pegasus = new PegasusReservationSystem();
        System.out.println("For THY press 1 and for Pegasus press 2");
        int airlineofChoice = scanner.nextInt();

        switch (airlineofChoice) {
            case 1:
                thy.makeReservation();
                break;
            case 2:
                pegasus.makeReservation();
                break;
        }
        System.out.println("Would you like to buy another plane ticket?\n" +
                "press y if you want to but another ticket\n" +
                "press n if you don't");

    }
}
