package reservation;

public abstract class AbstractFlightReservationSystem {
    /**
     * This one is abstract because we will not be creating an object out of it.
     * life normally we can create objects from non abstracts class but in this case
     * <p>
     * AbstractFlightReservationSystem genericName = new AbstractFlightReservationSystem();
     * <p>
     * wouldn't work.
     * <p>
     * The default value for a Boolean ( object ) is null . The default value for a boolean ( primitive ) is false.
     */

    protected int numberOfSeats;
    protected boolean[] seats;
    // I don't remember what protected means.

    public AbstractFlightReservationSystem() {
    }

    public AbstractFlightReservationSystem(int numberOfSeats) {
        if (numberOfSeats < 10) {
            numberOfSeats = 10;
            System.out.println("In case if you assign less than 10 it will use 10 number of seats");
        }
        this.numberOfSeats = numberOfSeats;
        this.seats = new boolean[numberOfSeats];
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean[] getSeats() {
        return seats;
    }

    public void setSeats(boolean[] seats) {
        this.seats = seats;
    }

    /**
     * The first 5 number of seats are business and the rest is economy.
     *
     * @return
     */
    public boolean checkEconomy() {
        for (int i = 5; i < numberOfSeats; i++) {
            if (!seats[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkBusiness() {
        for (int i = 0; i < 5; i++) {
            if (!seats[i]) {
                return false;
            }
        }
        return true;
    }
    public boolean isPlaneFull() {
        if (checkEconomy() && checkBusiness()) {
            return true;
        }
        return false;
    }
    public void makeReservation() {}
}
