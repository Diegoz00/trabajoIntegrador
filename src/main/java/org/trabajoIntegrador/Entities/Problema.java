package org.trabajoIntegrador.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "problemas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Problema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String descripcionDelProblema;

    private String tipoDeProblema;

    private double tiempoDeResolucion;

    @OneToMany(mappedBy = "problema", cascade = CascadeType.ALL)
    private List<Incidentes> incidentes = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;

    private String consideraciones;
}
