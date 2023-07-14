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
@Table(name = "\"especialidad\"")
public class Especialidad {
    @Id
    @Column(name = "idespecialidad")
    private Integer idEspecialidad;

    @Column(name = "nombreespecialidad")
    private String nombreEspecialidad;

    @Column(name = "descriespecialidad")
    private String descripcionEspecialidad;

    @Column(name = "\"urlImagen\"")
    private String urlImagen;

}
