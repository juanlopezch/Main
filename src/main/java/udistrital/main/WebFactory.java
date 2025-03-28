/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udistrital.main;

/**
 *
 * @author Juan Chibuque
 */
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class WebFactory implements IOFactory {
    private HttpServletRequest request;
    private HttpServletResponse response;

    public WebFactory(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    @Override
    public Entrada crearEntrada() {
        return new EntradaWeb(request);
    }

    @Override
    public Salida crearSalida() {
        return new SalidaWeb(response);
    }
}
