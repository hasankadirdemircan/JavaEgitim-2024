package com.recap.springboot.rcrud.controller;

import com.recap.springboot.rcrud.model.Car;
import com.recap.springboot.rcrud.service.CarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/create")
    public Car createCar(@RequestBody Car car) {
        return carService.createCar(car);
    }

    @GetMapping("/all")
    public List<Car> getAllListCar() {
        return carService.getAllCarList();
    }

    @GetMapping("/{brandId}")
    public List<Car> getCarListByBrandId(@PathVariable("brandId") Long brandId) {
        return carService.findAllCarListByBrandId(brandId);
    }

    @DeleteMapping("/{carId}/{abc}")
    public void deleteCarById(@PathVariable("carId") Long carId, @PathVariable("abc") Long abc) {
        carService.deleteCarByIdd(carId);
    }
}
