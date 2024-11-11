package com.jorginho.tddcomjunit.services;

import com.jorginho.tddcomjunit.Entity.Curse;
import com.jorginho.tddcomjunit.repository.CuserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateServicecurse  {

    public CreateServicecurse(CuserJpaRepository repository) {
        this.repository = repository;
    }
    @Autowired
    private CuserJpaRepository repository;

    public Curse execute(Curse curse) {
        

        //Validar se o curso exite
        Curse existedCurse = this.repository.findByName(curse.getName());

        if(existedCurse != null) {
           throw new Error("Curso já existe");
        }

        // se não -Salvar e retornar o novo curso
        return repository.save(curse);
    }

}
