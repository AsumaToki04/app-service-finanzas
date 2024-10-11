package pe.edu.cibertec.app_service_finanzas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestionPagoController {

    @GetMapping("/pago")
    public String obtenerPagos() {
        return "Respuesta del servicio de Finanzas-Pagos";
    }
}
