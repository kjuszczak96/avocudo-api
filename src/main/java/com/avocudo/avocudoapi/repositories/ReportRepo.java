package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.Report;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepo extends JpaRepository<Report, Long> {
    
}