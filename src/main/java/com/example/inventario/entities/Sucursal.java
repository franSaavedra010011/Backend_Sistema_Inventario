package com.example.inventario.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "sucursal")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Sucursal extends Base {

    @Column(name = "nombre")
    private String nombreSucursal;
    @Column(name = "ubicacion")
    private String ubicacSucursal;
    @Column(name = "telefono")
    private String telefSucursal;
    @Column(name = "correo")
    private String correoSucursal;
}
