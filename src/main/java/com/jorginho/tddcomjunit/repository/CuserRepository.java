package com.jorginho.tddcomjunit.repository;

import com.jorginho.tddcomjunit.Entity.Curse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CuserRepository implements ICurseRepository {
    @Autowired
    private CuserRepository couserJpaRepository;


    @Override
    public Curse findByName(String name) {
       return this.couserJpaRepository.findByName(name);
    }

    @Override
    public Curse save(Curse curse) {
        return this.couserJpaRepository.save(curse);
    }
}
