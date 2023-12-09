package web.service;

import web.dao.CarDao;
import web.dao.CarDaoListImp;
import web.models.Car;

import java.util.List;

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

    public static void main(String[] args) {
        CarService carService = new CarServiceImp( new CarDaoListImp() );
        System.out.println( carService.getCars( 0 ) );
    }
}
