package hn.unah.autolote.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.autolote.Modelos.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer>{
    
}
