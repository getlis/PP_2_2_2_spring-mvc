package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String cars(Model model , @RequestParam(value = "count", required = false) Integer count){

        if (  count != null && count >= 0 ) {
            model.addAttribute( "cars", carService.getCars( count ) );
        } else {
            model.addAttribute( "cars", carService.getCars( ) );
        }

        return "cars";
    }
}
