package hn.unah.autolote.Modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reserva")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreserva")
    private int idReserva;

    @JoinColumn(name = "idcliente", referencedColumnName = "idcliente")
    private Cliente idCliente;

    @JoinColumn(name = "idvehiculo", referencedColumnName = "idvehiculo")
    private Vehiculo idVehiculo;

    private Date fecha;

    private int dias;

    private double total;

}