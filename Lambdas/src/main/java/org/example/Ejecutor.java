package org.example;

@FunctionalInterface
public interface Ejecutor {
    String ejecutar(String parametro);

    default void metodoDefecto(){

    }

    static void metodoEstatico(){

    }
}
