package hn.unah.autolote.Servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.autolote.Modelos.Vehiculo;
import hn.unah.autolote.Repositorios.VehiculoRepository;
import hn.unah.autolote.Servicios.VehiculoServices;

@Service
public class VehiculoServicesImpl implements VehiculoServices {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> obtenerTodosVehiculos() {
        return vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo obtenerVehiculoId(int idVehiculo) {
    Vehiculo vehiculo = vehiculoRepository.findById(idVehiculo).get();

        if(vehiculo!=null){
            return vehiculo;
        }
        return null;
    }


    
}
