package pl.maniaq.cars;

public class FuelCar extends Car {
    int fuelLiter;

    public FuelCar(String brand, String color, int fuelLiter) {
        super(brand, color);
        this.fuelLiter = fuelLiter;
    }

    public String getInfo() {
        return "Samochód spalinowany. Marka: " + brand + ", kolor samochodu: " + color + ", ilość benzyny: " + fuelLiter;
    }
}
