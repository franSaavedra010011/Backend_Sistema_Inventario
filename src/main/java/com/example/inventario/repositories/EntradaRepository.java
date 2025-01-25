package com.example.inventario.repositories;

import com.example.inventario.entities.Categoria;
import com.example.inventario.entities.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntradaRepository extends BaseRepository<Entrada, Long> {
}
