package hn.unah.autolote.Servicios;

import java.util.List;

import hn.unah.autolote.Modelos.Vehiculo;

public interface VehiculoServices {
    
    public Vehiculo crearVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> obtenerTodosVehiculos();

    public Vehiculo obtenerVehiculoId(int idVehiculo);


}
