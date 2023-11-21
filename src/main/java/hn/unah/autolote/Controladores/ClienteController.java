package hn.unah.autolote.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.autolote.Modelos.Cliente;
import hn.unah.autolote.Servicios.Impl.ClienteServicesImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    
    @Autowired
    ClienteServicesImpl clienteServicesImpl;
    
    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return clienteServicesImpl.crearCliente(cliente);
    }

    @GetMapping("/obtenertodos")
    public List<Cliente> crearCliente(){
        return clienteServicesImpl.obtenerTodosClientes();
    }

    @GetMapping("/obtener")
    public Cliente crearCliente(@RequestParam(name = "idCliente") int idCliente){
        return clienteServicesImpl.obtenerClienteId(idCliente);
    }

}
