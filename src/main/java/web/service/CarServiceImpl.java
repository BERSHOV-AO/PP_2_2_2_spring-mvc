package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
        carDao.saveCar(new Car("BMW", 5, "black"));
        carDao.saveCar(new Car("Audi", 7, "blue"));
        carDao.saveCar(new Car("Lada", 12, "white"));
        carDao.saveCar(new Car("Reno", 3, "yellow"));
        carDao.saveCar(new Car("KIA", 10, "green"));
    }

    @Override
    public void saveCar(Car car) {
        carDao.saveCar(car);
    }

    @Override
    public List<Car> getAllCar() {
        return carDao.getAllCar();
    }

    @Override
    public List<Car> getRequestedCars(Integer count) {
        List<Car> cars = carDao.getAllCar();
        if (count == null || count >= 5) {
            return cars;
        } else {
            return cars.subList(0, Math.min(count, cars.size()));
        }
    }
}
