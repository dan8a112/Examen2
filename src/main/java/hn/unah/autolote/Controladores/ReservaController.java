package hn.unah.autolote.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.autolote.DTO.reservasDTO;
import hn.unah.autolote.Servicios.Impl.ReservaServicesImpl;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    ReservaServicesImpl reservaServicesImpl;
    
    @PostMapping("/crear")
    public String crearCliente(@RequestBody reservasDTO reserva){
        return reservaServicesImpl.crearReserva(reserva);
    }

}
