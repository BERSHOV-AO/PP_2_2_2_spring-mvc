package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    List<Car> cars = new ArrayList<>();

    @Override
    public void saveCar(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getAllCar() {
        return cars;
    }
}
