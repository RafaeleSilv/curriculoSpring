package com.example.curriculo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curriculo.models.formacao;
import com.example.curriculo.services.formacaoService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/curriculo/formacao")
public class FormacaoController {

    private final formacaoService formacaoService;

    @GetMapping
    public List<formacao> getAll() {
        return formacaoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<formacao> getById(@PathVariable Long id) {
        formacao formacao= formacaoService.findById(id);
        return formacao != null ? ResponseEntity.ok(formacao) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public formacao create(@RequestBody formacao formacao) {
        return formacaoService.save(formacao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<formacao> update(@PathVariable Long id, @RequestBody formacao formacao) {
        formacao.setFormacaoid(id);
        formacao updatedFormacao = formacaoService.save(formacao);
        return ResponseEntity.ok(updatedFormacao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        formacaoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}