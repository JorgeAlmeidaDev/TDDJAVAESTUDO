package com.jorginho.tddcomjunit.repository;

import com.jorginho.tddcomjunit.Entity.Curse;

public interface ICurseRepository {
    public Curse findByName(String name);
    public Curse save(Curse curse);
}
