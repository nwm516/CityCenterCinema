package org.example;

/**
 * Defines SeniorClub subclass of MovieClub superclass
 *
 * @author Nicholas Miller
 * @version 10/17/2023
 */
public class SeniorClub extends MovieClub {
    /**
     * Assigns ticketPrice to double for future price allocation
     */
    private double ticketPrice;
    /**
     * Assigns yearlyFee to a double
     */
    private double yearlyFee = 5.00;
    /**
     * Defines benefits inherited from superclass
     * & additional club-specific benefits
     */
    private static String benefits = MovieClub.getBenefits() + ", Free child-sized popcorn & soda";
    /**
     * Defines name for specific MovieClub
     */
    private String clubName = "Senior Club";
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
    public SeniorClub(double ticketPrice) {
       super(ticketPrice);
       this.ticketPrice = ticketPrice;
    }

    /**
     * Returns benefits for SeniorClub
     *
     * @return  String for benefits for Senior Club
     */
    public static String getBenefits() {
        return benefits;
    }

    /**
     * Returns yearly fee for SeniorClub
     *
     * @return  double value of yearly fee for Senior Club
     */
    public double getYearlyFee() {
        return yearlyFee;
    }

    /**
     * Returns ticket price for SeniorClub,
     * which includes the discounted rate of 50% from general admission
     *
     * @return  double value of ticket price for Senior Club
     */
    public double getTicketPrice() {
        return ticketPrice * 0.5;
    }

    /**
     * Returns amount of free passes associated with the SeniorClub
     *
     * @return  integer value for amount of free passes associated with Senior Club
     */
    public int getFreePassCount() {
        return freePassCount;
    }

    /**
     * Formatted to-string with summation of SeniorClub's info
     *
     * @return  Formatted to-string indicating club name, ticket price, yearly fee, club benefits, & free monthly passes
     */
    @Override
    public String toString() {
        return String.format("Name: %s\nTicket Price: $%.2f\nYearly Fee: $%.2f\nClub Benefits: %s\nFree Monthly Passes: %s\n", clubName, this.getTicketPrice(), this.getYearlyFee(), getBenefits(), this.getFreePassCount());
    }

}
