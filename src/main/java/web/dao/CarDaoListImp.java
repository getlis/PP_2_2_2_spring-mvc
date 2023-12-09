package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoListImp implements CarDao {

    private static final List<Car> cars;

    static {
        cars = new ArrayList<>();

        cars.add( new Car(  40000, "Audi", 250 ) );
        cars.add( new Car(  45000, "BMW", 260 ));
        cars.add( new Car(  50000, "Mercedes", 240 ) );
        cars.add( new Car( 35000, "Ford", 230 ) );
        cars.add( new Car( 85000, "Tesla", 300 ) );

    }

    public CarDaoListImp() {
    }

    @Override
    public List<Car> getCars( ) {
        return cars;
    }

    @Override
    public List<Car> getCars( int countCars ) {
        return cars.stream().limit( countCars ).collect( Collectors.toList() );
    }
}
