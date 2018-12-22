package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.Report;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepo extends CrudRepository<Report, Long> {
    
}