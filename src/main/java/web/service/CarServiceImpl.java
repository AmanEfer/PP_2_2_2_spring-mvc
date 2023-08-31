package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;


    @Override
    public List<Car> getCars(int count) {
        if (count > 5) {
            count = 5;
        }

        return carDao.getCars(count);
    }
}
