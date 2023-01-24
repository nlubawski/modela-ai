package com.modelaai.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelaai.api.Dto.CarDTO;
import com.modelaai.api.Model.Car;
import com.modelaai.api.Repository.CarRepository;

@RestController
@RequestMapping("/api/cars")
public class CarController {

  @Autowired
  private CarRepository repository;

  @GetMapping
  public List<Car> listAll(){
    return repository.findAll();
  }

  @PostMapping
  public void create(@RequestBody CarDTO req) {
    repository.save(new Car(req));
  }
}
