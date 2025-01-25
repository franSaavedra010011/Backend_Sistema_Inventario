package com.example.inventario.repositories;

import com.example.inventario.entities.Categoria;
import com.example.inventario.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends BaseRepository<Producto, Long> {
}
