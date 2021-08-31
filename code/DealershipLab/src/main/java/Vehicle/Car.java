package Vehicle;

public class Car {

    private double price;
    private String colour;
    private String model;
    private int year;
    private double engine;
    private String gearbox;

    public Car(double price, String colour, String model, int year, double engine, String gearbox ){
        this.price = price;
        this.colour = colour;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.gearbox = gearbox;
    }


    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getEngine() {
        return engine;
    }

    public String getGearbox() {
        return gearbox;
    }
}
