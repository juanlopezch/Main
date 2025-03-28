/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package udistrital.main;

/**
 *
 * @author Juan Chibuque
 */
public class Main {
    public static void main(String[] args) {
        IOFactory fabrica = FabricaSelector.obtenerFabrica("consola"); // Cambiar a "jframe" o "web"
        Cliente cliente = new Cliente(fabrica);
        cliente.ejecutar();
    }
}
