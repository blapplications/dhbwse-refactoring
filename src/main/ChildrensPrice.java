package main;

public class ChildrensPrice implements Price {

    public double getCharge(int daysRented) {
        if (daysRented > 3) return (daysRented - 3) * 1.5;
        else return 1.5;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}

