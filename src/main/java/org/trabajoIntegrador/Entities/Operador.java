package org.trabajoIntegrador.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "operadores")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Operador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String correoElectronico;

    @ManyToOne
    @JoinColumn(name = "mesa_de_ayuda_id")
    private MesaDeAyuda mesaDeAyuda;
}
