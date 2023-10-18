package org.example;

/**
 * Defines MovieClub superclass
 *
 * @author  Nicholas Miller
 * @version 10/17/2023
 */

abstract class MovieClub {
    /**
     * Assigns ticketPrice to double for future price allocation
     */
    private double ticketPrice;
    /**
     * Defines base benefit for all movie classes to inherit
     * & is defined as static for access to MovieClub's benefits
     * within subsidiary MovieClubs
     */
    private static String benefits = "Online Ticketing";
    /**
     * Defines name for specific MovieClub
     */
    private String clubName = "Movie Club";

    /**
     * MovieClub constructor, using ticketPrice to define ticket pricing,
     * & throws IllegalArgumentException in input value is equal or less than zero
     *
     * @param ticketPrice   defines ticket price
     */
    public MovieClub(double ticketPrice) {
        if (ticketPrice <= 0.00){
            throw new IllegalArgumentException("ticket price cannot be at or below $0.00");
        }
        this.ticketPrice = ticketPrice;
    }

    /**
     * Getter for ticketPrice
     *
     * @return  double value for ticket price for MovieClub
     */
    public abstract double getTicketPrice();

    /**
     * Getter for club benefits
     *
     * @return  String value for benefits associated with MovieClub
     */
    public static String getBenefits() {
        return benefits;
    }

    /**
     * Setter for ticket price
     *
     * @param ticketPrice   sets ticket price
     */
    public void setTicketPrice(double ticketPrice) {
        if (ticketPrice <= 0.00){
            throw new IllegalArgumentException("ticket price cannot be at or below $0.00");
        }
        this.ticketPrice = ticketPrice;
    }

    /**
     * Formatted to-string with summation of MovieClub's info
     *
     * @return  Formatted to-string indicating club name, ticket price, & club benefits
     */
    @Override
    public String toString() {
        return String.format("Name: %s\nTicket Price: $%.2f\nClub Benefits: %s\n\n", clubName, ticketPrice, benefits);
    }
}
