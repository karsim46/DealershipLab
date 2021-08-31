package Person;

import Vehicle.Car;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Car> customerCars;
    private double wallet;
    private String name;


    public Customer (double wallet, String name) {
        this.wallet = wallet;
        this.name = name;
        this.customerCars = new ArrayList<>();

    }


    public double getWallet() {
        return wallet;
    }

    public String getName() {
        return name;
    }
}
