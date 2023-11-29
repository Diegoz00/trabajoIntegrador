package org.trabajoIntegrador.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

    @Entity
    @Table(name = "especialidades")
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public class Especialidad {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String nombre;

        @ManyToMany(mappedBy = "especialidades")
        private List<Tecnico> tecnicos = new ArrayList<>();

        @OneToMany(mappedBy = "especialidad", cascade = CascadeType.ALL)
        private List<Problema> problemas = new ArrayList<>();
    }
