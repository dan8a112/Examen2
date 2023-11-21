package hn.unah.autolote.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class reservasDTO {

    private int codigoCliente;
    private int codigoVehiculo;
    private int cantidadDias;

}
