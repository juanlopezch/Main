/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udistrital.main;

/**
 *
 * @author Juan Chibuque
 */
class SalidaConsola implements Salida {
    @Override
    public void mostrarDatos(String mensaje) {
        System.out.println("Salida Consola: " + mensaje);
    }
}
