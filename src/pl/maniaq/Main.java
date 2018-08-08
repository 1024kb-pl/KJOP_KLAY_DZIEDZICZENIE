package pl.maniaq;

import pl.maniaq.cars.Car;
import pl.maniaq.cars.EletricCar;
import pl.maniaq.cars.FuelCar;
import pl.maniaq.fruits.Apple;
import pl.maniaq.fruits.Fruit;
import pl.maniaq.fruits.Pineapple;
import pl.maniaq.fruits.Strawberry;

public class Main {

    public static void main(String[] args) {
        EletricCar eletricCar1 = new EletricCar("Tesla", "Black", 100);
        FuelCar fuelCar1 = new FuelCar("BMW", "White", 40);

        System.out.println(eletricCar1.getInfo());
        System.out.println(fuelCar1.getInfo());

        Car eletricCar2 = new EletricCar("Tesla", "Black", 100);
	    Car fuelCar2 = new FuelCar("BMW", "White", 40);

	    System.out.println(((EletricCar) eletricCar2).getInfo()); // oba obiekty są rzutowane na typ wyższego rzędu
        System.out.println(((FuelCar) fuelCar2).getInfo()); // , w którym znajduje się metoda getInfo()
        // gdyby metoda była getInfo() była w klasie Car to nie byłoby żadnego rzutowania

        Fruit apple = new Apple();
        Fruit pineapple = new Pineapple();
        Fruit strawberry = new Strawberry();

        Fruit [] fruits = { apple, pineapple, strawberry };
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }



    }
}
