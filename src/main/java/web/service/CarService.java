package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void saveCar(Car car);

    List<Car> getAllCar();

    public List<Car> getRequestedCars(Integer count);
}
