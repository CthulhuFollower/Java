/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_act5;
import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Java_Act5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        operaciones calculadora = new operaciones(0, 0);
        System.out.println("Indique el valor de X:");
        calculadora.setX(entrada.nextFloat());
        
        System.out.println("Indique el valor de Y:");
        calculadora.setY(entrada.nextFloat());
        
        System.out.println("X= " + calculadora.getX());
        System.out.println("Y= " + calculadora.getY());
        System.out.println("Suma= " + calculadora.suma());
        System.out.println("Resta= " + calculadora.resta());
        System.out.println("Multiplicacion= " + calculadora.multiplicacion());
        System.out.println("Division= " + calculadora.division());
        System.out.println("Modulo= " + calculadora.modulo());
    }
    
}
