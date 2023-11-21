package hn.unah.autolote.Servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.autolote.Modelos.TipoVehiculo;
import hn.unah.autolote.Repositorios.TipoVehiculoRepository;
import hn.unah.autolote.Servicios.TipoVehiculoServices;

@Service
public class TipoVehiculoServicesImpl implements TipoVehiculoServices{

    @Autowired
    TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return tipoVehiculoRepository.save(tipoVehiculo);
    }
    
}
