package com.example.inventario.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "salida")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Salida extends Base {

    @Column(name = "fecha_hora_s")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaHoraSalida = LocalDateTime.now();
    @Column(name = "cantidad")
    private int cantSalida;
    @Column(name = "precio_vendido")
    private int precioVendido;
    @Column(name = "subtotal_s")
    private int subtotalSalida;
    @Column(name = "total_s")
    private int totalSalida;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_entrada")
    private Entrada entrada;
}
