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

class EntradaWeb implements Entrada {
    private HttpServletRequest request;

    public EntradaWeb(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public String ingresarDatos() {
        return request.getParameter("dato"); // Obtiene el parámetro 'dato' de la solicitud
    }
}
