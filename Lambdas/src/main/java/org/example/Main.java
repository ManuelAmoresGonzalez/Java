package org.example;

public class Main {
    public static void main(String[] args) {

       Ejecutor claseAnonimaEjecutor =  new Ejecutor(){
            @Override
            public String ejecutar(String parametro) {
                System.out.println("Hola desde una clase "+parametro);
                return "Hola desde una clase "+parametro;
            }
        };

        Ejecutor lambdaEjecutor = (parametro) ->
        {
            System.out.println("Hola desde nuestra "+parametro);
            return "Hola desde nuestra "+parametro;
        };


        claseAnonimaEjecutor.ejecutar("anonima");
        lambdaEjecutor.ejecutar("lambda");
    }
}