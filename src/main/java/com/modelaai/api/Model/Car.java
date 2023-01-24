package com.modelaai.api.Model;

import com.modelaai.api.Dto.CarDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {

  public Car(CarDTO data){
    this.modelo = data.modelo();
    this.fabricante = data.fabricante();
    this.dataFabricacao = data.dataFabricacao();
    this.valor = data.valor();
    this.anoModelo = data.anoModelo();

  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 200, nullable = false)
  private String modelo;

  @Column(length = 200, nullable = false)
  private String fabricante;

  @Column(length = 200, nullable = false)
  private String dataFabricacao;

  @Column(length = 200, nullable = false)
  private Double valor;

  @Column(length = 200, nullable = false)
  private int anoModelo;
}
