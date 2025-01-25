package com.example.inventario.repositories;

import com.example.inventario.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends BaseRepository<Categoria, Long> {
}
