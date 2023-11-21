package hn.unah.autolote.Servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.autolote.Modelos.Cliente;
import hn.unah.autolote.Repositorios.ClienteRepository;
import hn.unah.autolote.Servicios.ClienteServices;

public class ClienteServicesImpl implements ClienteServices{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerTodosClientes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerTodosClientes'");
    }

    @Override
    public Cliente obtenerClienteId(int idCliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerClienteId'");
    }
    
}
