package org.example;
/**
 * Defines Platinum+Club subclass of MovieClub superclass
 *
 * @author Nicholas Miller
 * @version 10/17/2023
 */
public class PlatinumPlusClub extends PlatinumClub {
    /**
     * Assigns ticketPrice to double for future price allocation
     */
    private double ticketPrice;
    /**
     * Assigns yearlyFee to a double
     */
    private static double yearlyFee = PlatinumClub.getYearlyFee() + 10.00;
    /**
     * Defines benefits inherited from superclass
     * & additional club-specific benefits
     */
    private static String benefits = PlatinumClub.getBenefits();
    /**
     * Defines name for specific MovieClub
     */
    private String clubName = "Platinum+ Club";
    /**
     * Defines free passes for specific MovieClub
     */
    private static int freePassCount = PlatinumClub.getFreePassCount() + 2;
    /**
     * MovieClub constructor, using ticketPrice to define ticket pricing,
     * & throws IllegalArgumentException in input value is equal or less than zero.
     * Acquired from MovieClub superclass.
     *
     * @param ticketPrice   defines ticket price
     */
    public PlatinumPlusClub(double ticketPrice) {
        super(ticketPrice);
        this.ticketPrice = ticketPrice;
    }

    /**
     * Returns benefits for Platinum+Club
     *
     * @return  String for benefits for Platinum+ Club
     */
    public static String getBenefits() {
        return benefits;
    }

    /**
     * Returns yearly fee for Platinum+Club
     *
     * @return  double value of yearly fee for Platinum+ Club
     */
    public static double getYearlyFee() {
        return yearlyFee;
    }

    /**
     * Returns ticket price for Platinum+Club,
     * which is 90% of the standard admission price
     *
     * @return  double value of ticket price for Platinum+ Club
     */
    public double getTicketPrice() {
        return ticketPrice * 0.8;
    }

    /**
     * Returns amount of free passes associated with the Platinum+Club
     *
     * @return  integer value for amount of free passes associated with Platinum+ Club
     */
    public static int getFreePassCount() {
        return freePassCount;
    }

    /**
     * Formatted to-string with summation of Platinum+Club's info
     *
     * @return  Formatted to-string indicating club name, ticket price, yearly fee, club benefits, & free monthly passes
     */
    @Override
    public String toString() {
        return String.format("Name: %s\nTicket Price: $%.2f\nYearly Fee: $%.2f\nClub Benefits: %s\nFree Monthly Passes: %s\n", clubName, this.getTicketPrice(), this.getYearlyFee(), getBenefits(), this.getFreePassCount());
    }
}
