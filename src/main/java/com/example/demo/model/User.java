package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
    private Instant quitTimestamp;
    private Double pricePerCigarette;
    private Integer dailyConsumption;
}
