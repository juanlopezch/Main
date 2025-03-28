/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udistrital.main;

/**
 *
 * @author Juan Chibuque
 */
class JframeFactory implements IOFactory {
    @Override
    public Entrada crearEntrada() {
        return new EntradaJframe();
    }

    @Override
    public Salida crearSalida() {
        return new SalidaJframe();
    }
}
