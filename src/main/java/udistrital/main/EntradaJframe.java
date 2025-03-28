/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udistrital.main;

/**
 *
 * @author Juan Chibuque
 */
import javax.swing.JOptionPane;

class EntradaJframe implements Entrada {
    @Override
    public String ingresarDatos() {
        return JOptionPane.showInputDialog("Ingrese datos en JFrame:");
    }
}