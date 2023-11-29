package org.trabajoIntegrador.servicios;

import org.trabajoIntegrador.Entities.Tecnico;
import org.trabajoIntegrador.repositorios.TecnicoRepositorio;


import java.time.LocalDate;
import java.util.List;

@Service
public class TecnicoServicio {

    private final TecnicoRepositorio tecnicoRepositorio;

    @Autowired
    public TecnicoServicio(TecnicoRepositorio tecnicoRepositorio) {
        this.tecnicoRepositorio = tecnicoRepositorio;
    }

    public List<Tecnico> encontrarTecnicoConMasIncidentesResueltosUltimosNDias(int dias) {
        LocalDate fechaLimite = LocalDate.now().minusDays(dias);
        return tecnicoRepositorio.encontrarTecnicoConMasIncidentesResueltosUltimosNDias(fechaLimite);
    }

    public List<Tecnico> encontrarTecnicoConMasIncidentesResueltosEspecialidadUltimosNDias(String especialidad, int dias) {
        LocalDate fechaLimite = LocalDate.now().minusDays(dias);
        return tecnicoRepositorio.encontrarTecnicoConMasIncidentesResueltosEspecialidadUltimosNDias(especialidad, fechaLimite);
    }

    public List<Tecnico> encontrarTecnicoMasRapidoResolviendoUltimosNDias(int dias) {
        LocalDate fechaLimite = LocalDate.now().minusDays(dias);
        return tecnicoRepositorio.encontrarTecnicoMasRapidoResolviendoUltimosNDias(fechaLimite);
    }
}
