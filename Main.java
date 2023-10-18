package org.example;

public class Main {
    public static void main(String[] args) {

        double generalAdmission = 15.00;

        SeniorClub senior = new SeniorClub(generalAdmission);
        GoldClub gold = new GoldClub(generalAdmission);
        PlatinumClub platinum = new PlatinumClub(generalAdmission);
        PlatinumPlusClub plus = new PlatinumPlusClub(generalAdmission);

        MovieClub[] clubArray = new MovieClub[4];
        clubArray[0] = senior;
        clubArray[1] = gold;
        clubArray[2] = platinum;
        clubArray[3] = plus;

        for (MovieClub clubIndex : clubArray) {
            System.out.println(clubIndex);
        }

    }
}