package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false) String count) {

        System.out.println("count car: " + count);
        return "cars.html";
    }
}
