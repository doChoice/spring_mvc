package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller

public class CarController {
    @GetMapping("/cars")
    public String showCars(@RequestParam (required = false) Integer count, ModelMap model) {
        if (count == null || count > 5) {
            count = 5;
        }
        List<Car> cars = CarService.getCars(count);
        model.addAttribute("cars", cars);
        return "cars.html";
    }
}
