package Person;

import Vehicle.Car;

import java.util.ArrayList;

public class Dealer {

    private String name;
    private double till;
    private ArrayList<Car> dealerCars;

    public Dealer(String name, double till) {
        this.name = name;
        this.till = till;
        this.dealerCars = new ArrayList<>();
    }

    public Dealer(String name) {
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }
}


