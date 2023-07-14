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
@Table(name = "\"usuario\"")
public class Usuario {
    @Id
    @Column(name = "idusuario")
    private Integer idUsuario;
}
