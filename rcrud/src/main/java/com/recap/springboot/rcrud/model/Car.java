package com.recap.springboot.rcrud.model;

import com.recap.springboot.rcrud.enums.EngineType;
import com.recap.springboot.rcrud.enums.GearType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "car")
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand_id")
    private Long brandId;

    private String model;

    @Enumerated(EnumType.STRING)
    private GearType gearType;

    @Column(name = "top_speed")
    private int topSpeed;

    private int year;

    @Enumerated(EnumType.STRING)
    private EngineType engineType;
}
