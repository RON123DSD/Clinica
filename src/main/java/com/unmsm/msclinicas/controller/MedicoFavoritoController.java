package com.unmsm.msclinicas.controller;

import com.unmsm.msclinicas.dto.request.MedicoFavoritoRequest;
import com.unmsm.msclinicas.entity.MedicoFavorito;
import com.unmsm.msclinicas.service.MedicoFavoritoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ux-gestion-medicos/sm_health/servicio-al-cliente/v1/")
@RequiredArgsConstructor
public class MedicoFavoritoController {

    private final MedicoFavoritoService medicoFavoritoService;

    @PutMapping("/asignar-medico-favorito/")
    private MedicoFavorito asignarMedicoFavorito(@RequestBody MedicoFavoritoRequest medicoFavoritoRequest) {
        return medicoFavoritoService.registrarMedicoFavorito(medicoFavoritoRequest);
    }
}

