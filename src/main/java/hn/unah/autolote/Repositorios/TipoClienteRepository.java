package hn.unah.autolote.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.autolote.Modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer>{
    
}
