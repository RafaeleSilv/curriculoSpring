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

import com.example.curriculo.models.skill;
import com.example.curriculo.services.skillService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/curriculo/habilidade")
public class SkillController {

    private final skillService skillService;

    @GetMapping
    public List<skill> getAll() {
        return skillService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<skill> getById(@PathVariable Long id) {
        skill skill = skillService.findById(id);
        return skill != null ? ResponseEntity.ok(skill) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public skill create(@RequestBody skill skill) {
        return skillService.save(skill);
    }

    @PutMapping("/{id}")
    public ResponseEntity<skill> update(@PathVariable Long id, @RequestBody skill skill) {
        skill.setSkillid(id);
        skill updatedSkill = skillService.save(skill);
        return ResponseEntity.ok(updatedSkill);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        skillService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}