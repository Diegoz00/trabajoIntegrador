package org.trabajoIntegrador.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tecnicos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "tecnicos_especialidades",
            joinColumns = @JoinColumn(name = "tecnico_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_id")
    )
    private List<Especialidad> especialidades = new ArrayList<>();

    @OneToMany(mappedBy = "tecnico", cascade = CascadeType.ALL)
    private List<Problema> resolucionDeProblemas = new ArrayList<>();

    private String medioDeNotificacion;

    @ManyToMany(mappedBy = "tecnicos")
    private List<MesaDeAyuda> mesasDeAyuda = new ArrayList<>();
}
