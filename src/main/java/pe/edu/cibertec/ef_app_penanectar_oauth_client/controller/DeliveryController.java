package pe.edu.cibertec.ef_app_penanectar_oauth_client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DeliveryController {

    @GetMapping("/inicio")
    public String inicioApi(){
        return "Bienvenido a la plataforma de delivery-Api publica.";
    }
    @GetMapping("/pedidos")
    public String pedidosApi(){
        return "Ordenes del usuario-Api privada.";
    }
}