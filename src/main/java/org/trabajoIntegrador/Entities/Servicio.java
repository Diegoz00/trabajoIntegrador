package org.trabajoIntegrador.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "servicios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombreServicio;

    private String descripcion;

    private String sistemaOperativo;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
