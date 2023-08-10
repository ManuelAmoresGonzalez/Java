package org.formacion.jpa.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.formacion.jpa.domain.Persona;

public class Main {

    public static void main(String[] args) throws Exception {

        Persona person1 = new Persona("Manuel", 30);
        Persona person2 = new Persona("Mario", 35);
        Persona person3 = new Persona("Manuel", 30);

        //Metodo equals
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.equals(person3): " + person1.equals(person3));


        //Metodo hashcode
        System.out.println("HashCode de person1: " + person1.hashCode());
        System.out.println("HashCode de person2: " + person2.hashCode());
        System.out.println("HashCode de person3: " + person3.hashCode());

        HashSet<Persona> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        System.out.println("Tamaño de personSet: " + personSet.size());


    }

}
