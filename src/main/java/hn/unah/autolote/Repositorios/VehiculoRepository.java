package hn.unah.autolote.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.autolote.Modelos.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer>{
    
}
