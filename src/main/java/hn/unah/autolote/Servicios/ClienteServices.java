package hn.unah.autolote.Servicios;

import java.util.List;

import hn.unah.autolote.Modelos.Cliente;

public interface ClienteServices {
    
    public Cliente crearCliente(Cliente cliente);
    
    public List<Cliente> obtenerTodosClientes();

    public Cliente obtenerClienteId(int idCliente);

}
