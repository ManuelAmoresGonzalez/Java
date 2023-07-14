package com.globant.CrudSpringBoot.interfaceService;

import com.globant.CrudSpringBoot.model.Person;

import java.util.List;
import java.util.Optional;

public interface IPersonService {

    public List<Person> listar();
    public Optional<Person> listarId(int id);
    public int save(Person p);
    public void delete(int id);
}
