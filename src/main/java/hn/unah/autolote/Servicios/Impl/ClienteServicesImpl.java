package hn.unah.autolote.Servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.autolote.Modelos.Cliente;
import hn.unah.autolote.Repositorios.ClienteRepository;
import hn.unah.autolote.Servicios.ClienteServices;

@Service
public class ClienteServicesImpl implements ClienteServices{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerTodosClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerClienteId(int idCliente) {
        Cliente cliente = clienteRepository.findById(idCliente).get();

        if(cliente!=null){
            return cliente;
        }
        return null;
    }
    
}
