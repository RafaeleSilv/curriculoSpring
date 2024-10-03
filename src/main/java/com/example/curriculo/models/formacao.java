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

@Getter @Setter @NoArgsConstructor
@Entity
@ToString
public class formacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long formacaoid;

    private String instituicao;

    private String curso;

    private LocalDate inicio;
    
    private LocalDate previsaoFinal;
}