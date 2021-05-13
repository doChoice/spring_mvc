package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private static List<Car> cars = new ArrayList<>();
    static {
        cars.add(new Car("MB", "GLA", 20000));
        cars.add(new Car("VW", "Golf", 15000));
        cars.add(new Car("BMW", "X1", 19000));
        cars.add(new Car("Chevrolet", "Niva", 12000));
        cars.add(new Car("KIA", "Carnival", 21000));
    }

    public CarService() {
    }

    public static List<Car> getCars(int count) {
        List<Car> carsForView = cars.subList(0, count);
        return carsForView;
    }

}
