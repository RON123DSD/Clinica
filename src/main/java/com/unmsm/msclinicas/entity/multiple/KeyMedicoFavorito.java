package com.unmsm.msclinicas.entity.multiple;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KeyMedicoFavorito implements Serializable {
    private Integer idMedico;

    private Integer idUsuario;
}
