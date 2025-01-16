package entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "medicos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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


