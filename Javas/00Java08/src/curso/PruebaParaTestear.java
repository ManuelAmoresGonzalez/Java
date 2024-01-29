package curso;

import java.util.Scanner;

public class PruebaParaTestear {

    public int add(int numberA, int numberB){
        return numberA + numberB;
    }

    public char determineLetterGrade(int numberGrade){
        if(numberGrade > 5){
            return 'F';
        }else {
            throw new IllegalArgumentException("Number grade cannot ");
        }
    }

    public static void main(String[] args) {
        int numero, invertido = 0, resto;
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce un número: ");

        numero = consola.nextInt();

        while (numero > 0) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }

        System.out.println("Número invertido: " + invertido);
    }

}


