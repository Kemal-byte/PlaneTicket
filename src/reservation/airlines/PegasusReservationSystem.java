package reservation.airlines;

import reservation.AbstractFlightReservationSystem;

import java.util.Scanner;

public class PegasusReservationSystem extends AbstractFlightReservationSystem {

    public PegasusReservationSystem() {}

    public PegasusReservationSystem(int numberOfSeats) {
        super(numberOfSeats);
    }

    @Override
    public void makeReservation() {
        super.makeReservation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the reservation portal of Pegasus\n" +
                "If you would like to fly with business class please select 1:\n" +
                "For economy class select 2");
        int chooseOfClass = scanner.nextInt();
        if(chooseOfClass == 1) {
            System.out.println("You can choose the seats below");
            for (int i = 1; i < 6; i++) {
                System.out.println("i ");
            }
        } else {
            System.out.println("You can choose the seats below");
            for (int i = 5; i < getNumberOfSeats(); i++) {
                System.out.println("i ");
            }
        }
        int choosenSeatNumber = scanner.nextInt();

        switch(chooseOfClass) {
            case 1:
                if(checkBusiness()) {
                    System.out.println("Unfortunately business class is booked out");
                } else if ( choosenSeatNumber<=5) {
                    if (seats[choosenSeatNumber - 1]) {
                        System.out.println("That seat is already taken");
                    } else {
                        System.out.println("Your seat number is : " + choosenSeatNumber);
                        seats[choosenSeatNumber - 1] = true;
                    }
                }
                break;
            case 2:
                if(checkEconomy()) {
                    System.out.println("Unfortunately economy class is booked out");
                } else if ( choosenSeatNumber<=5) {
                    if (seats[choosenSeatNumber - 1]) {
                        System.out.println("That seat is already taken");
                    } else {
                        System.out.println("Your seat number is : " + choosenSeatNumber);
                        seats[choosenSeatNumber - 1] = true;
                    }
                }
                break;
        }
    }
}
