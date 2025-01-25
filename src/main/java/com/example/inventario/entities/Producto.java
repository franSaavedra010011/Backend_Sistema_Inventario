package com.example.inventario.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "producto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Producto extends Base {

    @Column(name = "nombre")
    private String nombreProducto;
    @Column(name = "stock")
    private int stockProducto;
    @Column(name = "precio_compra_act")
    private float precioCompraActual;
    @Column(name = "precio_venta_act")
    private float precioVentaActual;
    @Column(name = "descripcion")
    private String descripProducto;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_categoria")
    private Categoria categoria;

}
