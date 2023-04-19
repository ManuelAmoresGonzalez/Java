package org.example;

public class Main {
    public static void main(String[] args) {

        new Vehiculo(){
            private int numeroPasajeros;

            public void conducir(){
                System.out.println("Estoy conduciendo");
            }

        }.conducir();

        new InterfaceUSuario(){

            public void crearUsuario(){
                System.out.println("Creando usuario");
            }
        }.crearUsuario();
    }
}