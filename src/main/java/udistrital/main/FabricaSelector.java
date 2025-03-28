/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udistrital.main;

/**
 *
 * @author Juan Chibuque
 */
class FabricaSelector {
    public static IOFactory obtenerFabrica(String tipo) {
        switch (tipo.toLowerCase()) {
            case "consola":
                return new ConsolaFactory();
            case "jframe":
                return new JframeFactory();
            case "web":
                throw new UnsupportedOperationException("La fábrica web debe ser creada con request y response.");
            default:
                throw new IllegalArgumentException("Tipo de fábrica desconocido: " + tipo);
        }
    }
}
