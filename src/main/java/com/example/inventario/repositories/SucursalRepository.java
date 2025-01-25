package com.example.inventario.repositories;

import com.example.inventario.entities.Categoria;
import com.example.inventario.entities.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SucursalRepository extends BaseRepository<Sucursal, Long> {
}
