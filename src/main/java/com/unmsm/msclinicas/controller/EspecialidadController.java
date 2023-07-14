package com.unmsm.msclinicas.controller;

import com.unmsm.msclinicas.entity.Especialidad;
import com.unmsm.msclinicas.service.EspecialidadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ux-gestion-especialidades/the_cure/servicio-al-cliente/v1/")
@RequiredArgsConstructor
public class EspecialidadController {
    private final EspecialidadService especialidadService;

    @GetMapping("consultar-especialidades")
    private List<Especialidad> buscarTodos() {
        return especialidadService.buscarTodos();
    }

    @GetMapping("consultar-especialidades/{idEspecialidad}")
    private Especialidad buscarEspecialidadPoIdEspecialidad(
            @PathVariable("idEspecialidad") Integer idEspecialidad) {
        return especialidadService.buscarEspecialidad(idEspecialidad);
    }

}
