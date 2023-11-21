package hn.unah.autolote.Servicios.Impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.autolote.DTO.reservasDTO;
import hn.unah.autolote.Modelos.Cliente;
import hn.unah.autolote.Modelos.Reserva;
import hn.unah.autolote.Modelos.TipoVehiculo;
import hn.unah.autolote.Modelos.Vehiculo;
import hn.unah.autolote.Repositorios.ClienteRepository;
import hn.unah.autolote.Repositorios.ReservaRepository;
import hn.unah.autolote.Repositorios.TipoVehiculoRepository;
import hn.unah.autolote.Repositorios.VehiculoRepository;
import hn.unah.autolote.Servicios.ReservaServices;

@Service
public class ReservaServicesImpl implements ReservaServices{

    @Autowired
    ReservaRepository reservaRepository;

    @Autowired
    TipoVehiculoRepository tipoVehiculoRepository;

    @Autowired
    VehiculoRepository vehiculoRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public String crearReserva(reservasDTO datosReserva) {
        Cliente cliente = clienteRepository.findById(datosReserva.getCodigoCliente()).get();
        Vehiculo vehiculo = vehiculoRepository.findById(datosReserva.getCodigoVehiculo()).get();
        if(cliente!=null && vehiculo!=null){
            if(vehiculo.getDisponible()){

                vehiculo.setDisponible(false);
                vehiculoRepository.save(vehiculo);

                TipoVehiculo tipoVehiculo = vehiculo.getTipoVehiculo();

                double total = tipoVehiculo.getPrecioXHora()*(datosReserva.getCantidadDias()*24);

                Reserva reserva = new Reserva();
                reserva.setDias(datosReserva.getCantidadDias());
                reserva.setFecha(new Date(System.currentTimeMillis()));
                reserva.setIdCliente(datosReserva.getCodigoCliente());
                reserva.setIdVehiculo(datosReserva.getCodigoVehiculo());
                reserva.setTotal(total);

                reservaRepository.save(reserva);
                return "Se ha guardado la reserva";
            }
            return "El vehiculo no esta disponible para renta";
        }
        return "No se ha encontrado el cliente o vehiculo especificado";
    }

    
}
