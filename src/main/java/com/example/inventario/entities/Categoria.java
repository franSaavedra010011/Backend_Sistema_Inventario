package com.example.inventario.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "categoria")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Categoria extends Base {

    @Column(name = "nombre")
    private String nombreCategoria;
}
