package com.unmsm.msclinicas.service;

import com.unmsm.msclinicas.dto.request.MedicoFavoritoRequest;
import com.unmsm.msclinicas.entity.MedicoFavorito;

import java.util.List;

public interface MedicoFavoritoService {
    List<MedicoFavorito> buscarTodos();

    MedicoFavorito buscarMedicoFavorito(Integer idLocal);

    MedicoFavorito registrarMedicoFavorito(MedicoFavoritoRequest localRequest);

    MedicoFavorito actualizarMedicoFavorito(MedicoFavoritoRequest localRequest);

    boolean eliminarMedicoFavorito(Integer idLocal);
}
