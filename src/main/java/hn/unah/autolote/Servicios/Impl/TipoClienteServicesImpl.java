package hn.unah.autolote.Servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.autolote.Modelos.TipoCliente;
import hn.unah.autolote.Repositorios.TipoClienteRepository;
import hn.unah.autolote.Servicios.TipoClienteServices;

@Service
public class TipoClienteServicesImpl implements TipoClienteServices{

    @Autowired
    TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(String descripcion) {
        TipoCliente tipoCliente = new TipoCliente();
        tipoCliente.setDescripcion(descripcion);
        return tipoClienteRepository.save(tipoCliente);
    }
    
}
