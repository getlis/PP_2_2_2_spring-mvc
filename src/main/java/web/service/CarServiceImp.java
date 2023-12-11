package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }

    @Override
    public List<Car> getCars( int countCars ) {
        return carDao.getCars( countCars );
    }

}
