package com.unmsm.msclinicas.entity;

import com.unmsm.msclinicas.entity.multiple.KeyMedicoFavorito;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "\"medico_favorito\"")
@IdClass(KeyMedicoFavorito.class)
public class MedicoFavorito {
    @Id
    @Column(name = "idmedico")
    private Integer idMedico;

    @Id
    @Column(name = "idusuario")
    private Integer idUsuario;
/*
    @ManyToOne
    @JoinColumn("idmedico")
    private Medico medico;

    @ManyToOne
    @JoinColumn("idusuario")
    private Usuario usuario;*/
}
