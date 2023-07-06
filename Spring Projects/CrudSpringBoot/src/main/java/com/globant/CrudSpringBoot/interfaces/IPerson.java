package com.globant.CrudSpringBoot.interfaces;

import com.globant.CrudSpringBoot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPerson extends CrudRepository<Person,Integer> {

}
