package com.example.curriculo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curriculo.models.formacao;
import com.example.curriculo.repository.formacaoRepository;

import jakarta.transaction.Transactional;

@Service
public class formacaoService {

    @Autowired
    private formacaoRepository formationRepository;

    @Transactional
    public List<formacao> findAll() {
        return formationRepository.findAll();
    }

    @Transactional
    public formacao findById(Long id) {
        return formationRepository.findById(id).orElse(null);
    }

    @Transactional
    public formacao save(formacao formation) {
        return formationRepository.save(formation);
    }

    @Transactional
    public void deleteById(Long id) {
        formationRepository.deleteById(id);
    }
}