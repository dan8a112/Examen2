package hn.unah.autolote.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.autolote.Modelos.Vehiculo;
import hn.unah.autolote.Servicios.Impl.VehiculoServicesImpl;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {
    
    @Autowired
    VehiculoServicesImpl vehiculoServicesImpl;
    
    @PostMapping("/crear")
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo){
        return vehiculoServicesImpl.crearVehiculo(vehiculo);
    }

    @GetMapping("/obtenertodos")
    public List<Vehiculo> crearVehiculo(){
        return vehiculoServicesImpl.obtenerTodosVehiculos();
    }

    @GetMapping("/obtener")
    public Vehiculo crearCliente(@RequestParam(name = "idCliente") int idVehiculo){
        return vehiculoServicesImpl.obtenerVehiculoId(idVehiculo);
    }


}
