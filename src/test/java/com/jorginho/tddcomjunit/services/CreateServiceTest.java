package com.jorginho.tddcomjunit.services;

import com.jorginho.tddcomjunit.Entity.Curse;
import org.junit.jupiter.api.Test;
import com.jorginho.tddcomjunit.services.CreateServicecurse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateServiceTest {
@Test // anotacao para indicar que é um teste
    public void testCreate() {
       // criar um novo curso
        // criar um table curso (Entidade)
        // ID, description, name, workload

        Curse course = new Curse(); // criar um objeto
        course.setDescription("Curso_Description_Test"); // setar a descricao
        course.setName("Curso_Name"); // setar o nome
        course.setWorkload(100); // setar a carga horaria

        //criar um novo service
        CreateServicecurse createService = new CreateServicecurse(); // criar um objeto
        Curse createdCourse = createService.execute(course); // executar o metodo execute


        // criar um repositorio

        assertNotNull(createdCourse.getId()); // verificar se o id foi criado
    }
}
