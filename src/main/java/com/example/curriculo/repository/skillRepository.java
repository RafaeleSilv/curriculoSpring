package com.example.curriculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.curriculo.models.skill;

@Repository
public interface skillRepository extends JpaRepository<skill, Long>{

}