package Ejercicio3;

public class Cellphone {
    private String model;
    private String brand;
    private String range;
    private double price;

    public Cellphone(String model, String brand, String range, double price) {
        this.model = model;
        this.brand = brand;
        this.range = range;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getRange() {
        return range;
    }

    public double getPrice() {
        return price;
    }
}

