package com.jorginho.tddcomjunit.repository;

import com.jorginho.tddcomjunit.Entity.Curse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CurseinMemoryRepository implements ICurseRepository {
    private List<Curse> courses;

    public CurseinMemoryRepository() {
        this.courses = new ArrayList<>();
    }

    @Override
    public Curse findByName(String name) {
        Optional<Curse> optionalCursethis= this.courses.stream().filter(curse -> curse.getName().equals(name)).findFirst();
        return optionalCursethis.orElse(null);
    }

    @Override
    public Curse save(Curse curse) {
        this.courses.add(curse);
        curse.setId(UUID.randomUUID());
        return curse;
    }
}





