/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author oquintansocampo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase1 obj1 = new Clase1(7);
        Clase1 obj2 = new Clase1(9);
        obj2 = obj1;
        System.out.print(obj1.valorprop() + " ");
        System.out.print(obj2.valorprop() + " ");
    }
} 

    class Clase1 {

        static int prop = 0;

        public Clase1(int valor) {
            prop = valor;
        }

        public int valorprop() {
            return prop;

        }
    }
