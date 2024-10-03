package com.example.curriculo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curriculo.models.experiencia;
import com.example.curriculo.repository.experienciaRepository;

import jakarta.transaction.Transactional;

@Service
public class experienciaService {

    @Autowired
    private experienciaRepository experienceRepository;

    @Transactional
    public List<experiencia> findAll() {
        return experienceRepository.findAll();
    }

    @Transactional
    public experiencia findById(Long id) {
        return experienceRepository.findById(id).orElse(null);
    }

    @Transactional
    public experiencia save(experiencia experience) {
        return experienceRepository.save(experience);
    }

    @Transactional
    public void deleteById(Long id) {
        experienceRepository.deleteById(id);
    }
}