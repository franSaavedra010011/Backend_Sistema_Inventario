package com.example.inventario.repositories;

import com.example.inventario.entities.Categoria;
import com.example.inventario.entities.Salida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalidaRepository extends BaseRepository<Salida, Long> {
}
