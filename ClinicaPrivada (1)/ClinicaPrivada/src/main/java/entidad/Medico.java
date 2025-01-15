package entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Medico {

    @Id
    private int id;

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int telefono;
    private String cedula;
    private String email;
    private String especialidad;

}
