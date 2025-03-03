package com.example.inventario.repositories;

import com.example.inventario.entities.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends BaseRepository<Categoria, Long> {
    //JPQL
    @Query(value = "SELECT c FROM Categoria c WHERE c.nombreCategoria LIKE %:filtro%")
    List<Categoria> search(@Param("filtro") String filtro);
}
