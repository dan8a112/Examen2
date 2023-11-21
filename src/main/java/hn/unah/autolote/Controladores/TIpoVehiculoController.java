package hn.unah.autolote.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.autolote.Modelos.TipoVehiculo;
import hn.unah.autolote.Servicios.Impl.TipoVehiculoServicesImpl;

@RestController
@RequestMapping("/api/tipovehiculos")
public class TIpoVehiculoController {
    
    @Autowired
    TipoVehiculoServicesImpl tVehiculoServicesImpl;
    
    @PostMapping("/crear")
    public TipoVehiculo crearCliente(@RequestBody TipoVehiculo tipoVehiculo){
        return tVehiculoServicesImpl.crearTipoVehiculo(tipoVehiculo);
    }
}
