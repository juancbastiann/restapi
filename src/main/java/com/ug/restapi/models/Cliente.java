package com.ug.restapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String email;
    private Integer edad;
    private String direccion;
}
