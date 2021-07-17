package reservation.airlines;

import reservation.AbstractFlightReservationSystem;

import java.util.Scanner;

public class THYReservationSystem extends AbstractFlightReservationSystem {
    public THYReservationSystem() {}
    public THYReservationSystem(int numberofSeats) {
        super(numberofSeats);
    }

    @Override
    public void makeReservation() {
        super.makeReservation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the reservation portal of THY\n" +
                "If you would like to fly with business class please select 1:\n" +
                "For economy class select 2");
        int chooseOfClass = scanner.nextInt();
        if(chooseOfClass == 1) {
            System.out.println("You can choose one of the seats below");
            for(int i = 1; i<6; i++) {
                System.out.println(i+" ");
            }
        } else {
            System.out.println("You can choose one of the seats below");
            for (int j = 5; j < getNumberOfSeats(); j++) {
                System.out.println(j+ " ");
            }
        }
        int choosenSeatNumber = scanner.nextInt();
        switch (chooseOfClass){
            case 1:
                if(checkBusiness()) {
                    System.out.println("Unfortunately business class hasn't available seat.");
                } else if (choosenSeatNumber<=5) {
                    if(seats[choosenSeatNumber-1]) {
                        System.out.println("That seat is already taken");
                    } else {
                        System.out.println("Your seat number is : "+ choosenSeatNumber);
                        seats[choosenSeatNumber-1] = true;
                    }
                }
                break;
            case 2:
                if(checkEconomy()) {
                    System.out.println("We run out of economy class seats sorry.");
                } else if (choosenSeatNumber>5) {
                    if(seats[choosenSeatNumber - 1]) {
                        System.out.println("That seat is already taken");
                    } else {
                        System.out.println("Your seat number is : "+ choosenSeatNumber);
                        seats[choosenSeatNumber - 1] = true;
                    }
                }
                break;
        }
    }
}
