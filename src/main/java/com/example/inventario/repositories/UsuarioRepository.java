package com.example.inventario.repositories;

import com.example.inventario.entities.Categoria;
import com.example.inventario.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends BaseRepository<Usuario, Long> {
}
