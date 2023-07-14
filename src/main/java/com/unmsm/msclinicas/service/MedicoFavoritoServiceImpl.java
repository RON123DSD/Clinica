package com.unmsm.msclinicas.service;

import com.unmsm.msclinicas.dto.request.MedicoFavoritoRequest;
import com.unmsm.msclinicas.entity.MedicoFavorito;
import com.unmsm.msclinicas.repository.MedicoFavoritoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicoFavoritoServiceImpl implements MedicoFavoritoService{
    private final MedicoFavoritoRepository medicoFavoritoRepository;
    @Override
    public List<MedicoFavorito> buscarTodos() {
        return medicoFavoritoRepository.findAll();
    }

    @Override
    public MedicoFavorito buscarMedicoFavorito(Integer idLocal) {
        return null;
    }

    @Override
    public MedicoFavorito registrarMedicoFavorito(MedicoFavoritoRequest medicoFavoritoRequest) {

        return medicoFavoritoRepository.save(MedicoFavorito.builder()
                .idMedico(medicoFavoritoRequest.getIdMedico())
                .idUsuario(medicoFavoritoRequest.getIdUsuario())
                .build());
    }

    @Override
    public MedicoFavorito actualizarMedicoFavorito(MedicoFavoritoRequest localRequest) {
        return null;
    }

    @Override
    public boolean eliminarMedicoFavorito(Integer idLocal) {
        return false;
    }
}
