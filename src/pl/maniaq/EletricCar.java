package pl.maniaq;

public class EletricCar extends Car {
    int chargeLevel;

    public EletricCar(String brand, String color, int chargeLevel) {
        super(brand, color);
        this.chargeLevel = chargeLevel;
    }

    public String getInfo() {
        return "Samochód elektryczny. Marka: " + brand + ", kolor samochodu: " + color + ", poziom naładowania samochodu: " + chargeLevel;
    }
}
