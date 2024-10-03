package com.example.curriculo.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import com.example.curriculo.models.experiencia;
import com.example.curriculo.services.experienciaService; 
import lombok.RequiredArgsConstructor;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/curriculo/experiencia")
public class experienciaController { 

    private final experienciaService experienciaService; 

    @GetMapping
    public List<experiencia> getAll() {
        return experienciaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<experiencia> getById(@PathVariable Long id) {
        experiencia experiencia = experienciaService.findById(id); // Alterado para 'experiencia'
        return experiencia != null ? ResponseEntity.ok(experiencia) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public experiencia create(@RequestBody experiencia experiencia) { // Alterado para 'experiencia'
        return experienciaService.save(experiencia); // Alterado para 'experienciaService'
    }

    @PutMapping("/{id}")
    public ResponseEntity<experiencia> update(@PathVariable Long id, @RequestBody experiencia experiencia) { // Alterado para 'experiencia'
        experiencia.setExperienceid(id); // Se você tiver que mudar esse método, faça-o também
        experiencia updatedExperiencia = experienciaService.save(experiencia); // Alterado para 'experiencia'
        return ResponseEntity.ok(updatedExperiencia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        experienciaService.deleteById(id); // Alterado para 'experienciaService'
        return ResponseEntity.noContent().build();
    }
}
