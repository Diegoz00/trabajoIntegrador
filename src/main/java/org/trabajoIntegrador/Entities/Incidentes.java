package org.trabajoIntegrador.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "incidentes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Incidentes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "problema_id")
    private Problema problema;

    private boolean resuelto;
}
