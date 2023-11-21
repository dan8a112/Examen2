package hn.unah.autolote.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.autolote.Modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
}
