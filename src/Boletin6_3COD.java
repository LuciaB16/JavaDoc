/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6_3cod;

public class Boletin6_3COD {

    public static void main(String[] args) {

        /**
         * Instancio un objeto de la clase Circulo
         */
        Circulo circulo1 = new Circulo();
        /**
         * Doy valor al radio con un setter
         */
        circulo1.setRadio(5);
        circulo1.calcularArea();
        /**
         * Llamo al metodo calcular area y meto el resultado en la variable double resultado
         */
        double resultado = circulo1.calcularArea();
        /**
         * Saco por pantalla el area
         */
        System.out.println("El area es igual a " + resultado);
        /**
         * Llamo al metodo calcularLonxitude
         */
        circulo1.calcularLonxitude();
        /**
         * Guardo el resultado en la variable double resultado2
         */
        double resultado2 = circulo1.calcularLonxitude();
        /**
         * Saco la longitud por pantalla
         */
        System.out.println("La longitud es igual a " + resultado2);
    }

}
