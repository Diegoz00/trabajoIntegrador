package org.trabajoIntegrador.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import org.trabajoIntegrador.Entities.Incidente;

@Entity
@Table(name = "mesa_de_ayuda")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MesaDeAyuda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String ubicacion;

    @OneToMany(mappedBy = "mesaDeAyuda", cascade = CascadeType.ALL)
    private List<Operador> operadores = new ArrayList<>();

    @OneToMany(mappedBy = "mesaDeAyuda", cascade = CascadeType.ALL)
    private List<Incidente> incidentes = new ArrayList<>();

    @ManyToMany(mappedBy = "mesasDeAyuda")
    private List<Tecnico> tecnicos = new ArrayList<>();
}
