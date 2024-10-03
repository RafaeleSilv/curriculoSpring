package com.example.curriculo.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString @NoArgsConstructor
public class experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long experienceid;

    private String empresa;

    private String posicao;

    private String funcao;

    private LocalDate dataDeInicio;

    private LocalDate dataDeConclusao;
}