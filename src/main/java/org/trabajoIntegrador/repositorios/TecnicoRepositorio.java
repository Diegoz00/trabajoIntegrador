package org.trabajoIntegrador.repositorios;

import org.trabajoIntegrador.Entities.Tecnico;


import java.time.LocalDate;
import java.util.List;
public interface TecnicoRepositorio extends JpaRepository<Tecnico, Integer> {
    @Query("SELECT t FROM Tecnico t JOIN t.resolucionDeProblemas p WHERE p.resuelto = true AND p.fechaResolucion >= :fecha")
    List<Tecnico> encontrarTecnicoConMasIncidentesResueltosUltimosNDias(@Param("fecha") LocalDate fecha);

    @Query("SELECT t FROM Tecnico t JOIN t.resolucionDeProblemas p JOIN t.especialidades e WHERE e.nombre = :especialidad AND p.resuelto = true AND p.fechaResolucion >= :fecha")
    List<Tecnico> encontrarTecnicoConMasIncidentesResueltosEspecialidadUltimosNDias(@Param("especialidad") String especialidad, @Param("fecha") LocalDate fecha);

    @Query("SELECT t FROM Tecnico t JOIN t.resolucionDeProblemas p WHERE p.resuelto = true AND p.fechaResolucion >= :fecha ORDER BY p.tiempoDeResolucion ASC")
    List<Tecnico> encontrarTecnicoMasRapidoResolviendoUltimosNDias(@Param("fecha") LocalDate fecha);
}

