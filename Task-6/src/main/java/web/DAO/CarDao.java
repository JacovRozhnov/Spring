package web.DAO;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("Accent", "Grey", 2007));
        carList.add(new Car("Vaz", "Black", 2006));
        carList.add(new Car("UAZ", "Green", 1999));
        carList.add(new Car("Granta", "Orange", 2021));
        carList.add(new Car("Niva", "-", 2017));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> getCarsNumber(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}