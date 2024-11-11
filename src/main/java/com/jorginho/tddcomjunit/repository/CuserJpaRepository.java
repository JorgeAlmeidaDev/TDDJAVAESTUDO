package com.jorginho.tddcomjunit.repository;

import com.jorginho.tddcomjunit.Entity.Curse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CuserJpaRepository extends JpaRepository<Curse, UUID> {
    public Curse findByName(String name);
}
