package com.unmsm.msclinicas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "\"medico\"")
public class Medico {
    @Id
    @Column(name = "idmedico")
    private Integer idMedico;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "idespecialidad")
    private Integer idEspecialidad;
    @Column(name = "idclinica")
    private Integer idClinica;
}
