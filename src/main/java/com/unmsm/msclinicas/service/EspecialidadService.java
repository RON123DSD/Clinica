package com.unmsm.msclinicas.service;

import com.unmsm.msclinicas.dto.request.EspecialidadRequest;
import com.unmsm.msclinicas.entity.Especialidad;

import java.util.List;

public interface EspecialidadService {
    List<Especialidad> buscarTodos();

    Especialidad buscarEspecialidad(Integer idLocal);

    Especialidad registrarEspecialidad(EspecialidadRequest localRequest);

    Especialidad actualizarEspecialidad(EspecialidadRequest localRequest);

    boolean eliminarEspecialidad(Integer idEspecialidad);
}
