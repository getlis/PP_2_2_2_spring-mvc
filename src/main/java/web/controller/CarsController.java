package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.dao.CarDaoListImp;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarsController {
    @GetMapping("/cars")
    public String cars(Model model , @RequestParam(value = "count", required = false) Integer count){

        CarDao carDao = new CarDaoListImp();
        CarService carService = new CarServiceImp( carDao );

        if (  count != null && count >= 0 ) {
            model.addAttribute( "cars", carService.getCars( count ) );
        } else {
            model.addAttribute( "cars", carService.getCars( ) );
        }

        return "cars";
    }
}
