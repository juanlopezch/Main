/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udistrital.main;

/**
 *
 * @author Juan Chibuque
 */
class Cliente {
    private IOFactory factory;

    public Cliente(IOFactory factory) {
        this.factory = factory;
    }

    public void ejecutar() {
        Entrada entrada = factory.crearEntrada();
        Salida salida = factory.crearSalida();
        String datos = entrada.ingresarDatos();
        salida.mostrarDatos("Datos recibidos: " + datos);
    }
}
