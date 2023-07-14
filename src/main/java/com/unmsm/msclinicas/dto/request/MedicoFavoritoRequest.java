package com.unmsm.msclinicas.dto.request;

import lombok.Data;

@Data
public class MedicoFavoritoRequest {
    private Integer idMedico;
    private Integer idUsuario;
}
