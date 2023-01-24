package com.modelaai.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelaai.api.Model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
  


}
