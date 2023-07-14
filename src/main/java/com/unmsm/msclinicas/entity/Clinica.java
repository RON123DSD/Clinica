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
@Table(name = "\"clinica\"")
public class Clinica {
    @Id
    @Column(name = "idclinica")
    private Integer idClinica;

    @Column(name = "nombreclinica")
    private String nombreClinica;

}
