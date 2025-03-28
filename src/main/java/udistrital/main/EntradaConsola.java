/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udistrital.main;

/**
 *
 * @author Juan Chibuque
 */
import java.util.Scanner;

class EntradaConsola implements Entrada {
    @Override
    public String ingresarDatos() {
        System.out.print("Ingrese datos por consola: ");
        return new Scanner(System.in).nextLine();
    }
}
