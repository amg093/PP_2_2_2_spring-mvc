package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model1", 1, "white"));
        cars.add(new Car("model2", 2, "red"));
        cars.add(new Car("model3", 3, "pink"));
        cars.add(new Car("model4", 4, "black"));
        cars.add(new Car("Лодка :)", 5, "малиновый"));
        return cars.stream().limit(count).toList();
    }
}
