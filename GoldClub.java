package org.example;

/**
 * Defines GoldClub subclass of MovieClub superclass
 *
 * @author Nicholas Miller
 * @version 10/17/2023
 */
public class GoldClub extends MovieClub {
    /**
     * Assigns ticketPrice to double for future price allocation
     */
    private double ticketPrice;
    /**
     * Assigns yearlyFee to a double
     */
    private double yearlyFee = 15.00;
    /**
     * Defines benefits inherited from superclass
     * & additional club-specific benefits
     */
    private static String benefits = MovieClub.getBenefits() + ", Free soda refill";
    /**
     * Defines name for specific MovieClub
     */
    private String clubName = "Gold Club";
    /**
     * Defines free passes for specific MovieClub
     */
    private int freePassCount = 0;

    /**
     * MovieClub constructor, using ticketPrice to define ticket pricing,
     * & throws IllegalArgumentException in input value is equal or less than zero.
     *
     * Acquired from MovieClub superclass.
     *
     * @param ticketPrice   defines ticket price
     */
    public GoldClub(double ticketPrice) {
        super(ticketPrice);
        this.ticketPrice = ticketPrice;
    }

    /**
     * Returns benefits for GoldClub
     *
     * @return  String for benefits for Gold Club
     */
    public static String getBenefits() {
        return benefits;
    }

    /**
     * Returns yearly fee for GoldClub
     *
     * @return  double value of yearly fee for Gold Club
     */
    public double getYearlyFee() {
        return yearlyFee;
    }

    /**
     * Returns ticket price for GoldClub,
     * which is 90% of the standard admission price
     *
     * @return  double value of ticket price for Gold Club
     */
    public double getTicketPrice() {
        return ticketPrice * 0.9;
    }

    /**
     * Returns amount of free passes associated with the GoldClub
     *
     * @return  integer value for amount of free passes associated with Gold Club
     */
    public int getFreePassCount() {
        return freePassCount;
    }

    /**
     * Formatted to-string with summation of GoldClub's info
     *
     * @return  Formatted to-string indicating club name, ticket price, yearly fee, club benefits, & free monthly passes
     */
    @Override
    public String toString() {
        return String.format("Name: %s\nTicket Price: $%.2f\nYearly Fee: $%.2f\nClub Benefits: %s\nFree Monthly Passes: %s\n", clubName, this.getTicketPrice(), this.getYearlyFee(), getBenefits(), this.getFreePassCount());
    }
}
