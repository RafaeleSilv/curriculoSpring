package com.example.curriculo.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.curriculo.models.skill;
import com.example.curriculo.repository.skillRepository;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class skillService {

    @Autowired
    private skillRepository skillRepository;

    @Transactional
    public List<skill> findAll() {
        return skillRepository.findAll();
    }

    @Transactional
    public skill findById(Long id) {
        return skillRepository.findById(id).orElse(null);
    }

   @Transactional
    public skill save(skill skill) {
        return skillRepository.save(skill);
    }
    
    @Transactional
    public void deleteById(Long id) {
        skillRepository.deleteById(id);
    }
}