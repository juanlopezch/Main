/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udistrital.main;

/**
 *
 * @author Juan Chibuque
 */
class ConsolaFactory implements IOFactory {
    @Override
    public Entrada crearEntrada() {
        return new EntradaConsola();
    }

    @Override
    public Salida crearSalida() {
        return new SalidaConsola();
    }
}

