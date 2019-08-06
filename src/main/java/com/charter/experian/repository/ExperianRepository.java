package com.charter.experian.repository;

import com.charter.experian.model.Experian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperianRepository extends JpaRepository<Experian, Integer> {
}
