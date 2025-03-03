package com.example.inventario.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "entrada")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Entrada extends Base {

    /*
    @Column(name = "fecha_hora_e")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "dd-mm-yyyy HH:mm:ss")
    private LocalDateTime fechaHoraEntrada;
    */
    @Column(name = "fecha_hora_e")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaHoraEntrada = LocalDateTime.now();
    @Column(name = "cantidad_producto")
    private int cantProducto;
    @Column(name = "precio_entrada")
    private float precioEntrada;
    @Column(name = "precio_venta")
    private float precioVenta;
    @Column(name = "descripcion")
    private String descripEntrada;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "entrada_salida",
            joinColumns = @JoinColumn(name = "entrada_id"),
            inverseJoinColumns = @JoinColumn(name = "salida_id")
    )
    private List<Salida> salidas = new ArrayList<Salida>();

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_producto")
    private Producto producto;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_sucursal")
    private Sucursal sucursal;

}
