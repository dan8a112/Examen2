package hn.unah.autolote.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.autolote.Modelos.TipoVehiculo;

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Integer>{
    
}
