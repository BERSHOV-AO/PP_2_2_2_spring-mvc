package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    void saveCar(Car car);

    List<Car> getAllCar();

}
