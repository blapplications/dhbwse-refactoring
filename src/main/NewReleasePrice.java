package main;

public class NewReleasePrice implements Price {

    public double getCharge(int daysRented) {
        return (daysRented * 3);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return 2;
    }

}