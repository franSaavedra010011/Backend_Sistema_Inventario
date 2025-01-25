package com.example.inventario.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Usuario extends Base {

    @Column(name = "nombre")
    private String nombreUsuario;
    @Column(name = "apellido")
    private String apellidoUsuario;
    @Column(name = "correo")
    private String correoUsuario;
    @Column(name = "telefono")
    private String telefonoUsuario;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "rol")
    private String rolUsuario;
}
