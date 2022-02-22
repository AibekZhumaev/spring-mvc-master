package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zha_Aibek@mail.com
 */
@Controller
@RequestMapping("/cars")
public class Cars {
    static List<Car> cars = List.of(
            new Car("Mercedes-Benz", "E-Class", "white"),
            new Car("Jaguar", "XF", "blue"),
            new Car("Skoda", "Superb", "silver"),
            new Car("Volvo", "S90", "black")
    );


    @GetMapping("/cars")
    public String helloPage(@RequestParam(value = "name", required = false) String name, Model model) {
        model.addAttribute("cars", cars);
        return "cars";
    }


    @GetMapping
    public String getCars(@RequestParam(value = "count", required = false) int count, Model model) {
        List<Car> carList = new ArrayList<>();
        if (count > 5) {
            model.addAttribute("cars", cars);
        } else {
            for (int i = 0; i < count; i++) {
                carList.add(cars.get(i));
            }
            model.addAttribute("cars", carList);
        }
        return "cars";
    }
}
