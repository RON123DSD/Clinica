package com.unmsm.msclinicas.service;

import com.unmsm.msclinicas.dto.request.EspecialidadRequest;
import com.unmsm.msclinicas.entity.Especialidad;
import com.unmsm.msclinicas.repository.EspecialidadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EspecialidadServiceImpl implements EspecialidadService{

    private final EspecialidadRepository especialidadRepository;
    @Override
    public List<Especialidad> buscarTodos() {
        return especialidadRepository.findAll();
    }

    @Override
    public Especialidad buscarEspecialidad(Integer idLocal) {
        return especialidadRepository.findById(idLocal)
                .orElse(null);
    }

    @Override
    public Especialidad registrarEspecialidad(EspecialidadRequest localRequest) {
        return null;
    }

    @Override
    public Especialidad actualizarEspecialidad(EspecialidadRequest localRequest) {
        return null;
    }

    @Override
    public boolean eliminarEspecialidad(Integer idEspecialidad) {
        return false;
    }
}
