package hn.unah.autolote.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.autolote.Modelos.TipoCliente;
import hn.unah.autolote.Servicios.Impl.TipoClienteServicesImpl;

@RestController
@RequestMapping("/api/tipoclientes")
public class TIpoClienteController {

    @Autowired
    TipoClienteServicesImpl tClienteServicesImpl;
    
    @PostMapping("/crear")
    public TipoCliente crearCliente(@RequestParam(name = "descripcion") String descripcion){
        return tClienteServicesImpl.crearTipoCliente(descripcion);
    }

}
