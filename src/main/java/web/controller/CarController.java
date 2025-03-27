package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final List<Car> cars = new ArrayList<>();

    public CarController() {
        cars.add(new Car("BMW", 5, "black"));
        cars.add(new Car("Audi", 7, "blue"));
        cars.add(new Car("Lada", 12, "white"));
        cars.add(new Car("Reno", 3, "yellow"));
        cars.add(new Car("KIA", 10, "green"));
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, Model model) {

        List<Car> showCars;
        if (count == null || count >= 5) {
            showCars = cars;
        } else {
            showCars = cars.subList(0, Math.min(count, cars.size()));
        }
        model.addAttribute("selectedCars", showCars);
        return "cars";
    }
}
