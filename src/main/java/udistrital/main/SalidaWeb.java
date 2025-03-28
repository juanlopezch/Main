/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udistrital.main;

/**
 *
 * @author Juan Chibuque
 */
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

class SalidaWeb implements Salida {
    private HttpServletResponse response;

    public SalidaWeb(HttpServletResponse response) {
        this.response = response;
    }

    @Override
    public void mostrarDatos(String mensaje) {
        try {
            response.setContentType("text/html");
            response.getWriter().println("<h1>Salida Web: " + mensaje + "</h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
