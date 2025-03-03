package com.example.inventario.repositories;

import com.example.inventario.entities.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductoRepository extends BaseRepository<Producto, Long> {

    //boolean existByNombre(String nombre);

    //JpaRepository
    List<Producto> findByNombreProductoContaining(String nombre);


    //JPQL
    @Query(value = "SELECT p FROM Producto p WHERE p.nombreProducto LIKE %:filtro%")
    List<Producto> search(@Param("filtro") String filtro);


    //Nativo
    @Query(
            value = "SELECT * FROM producto WHERE producto.nombre LIKE %:filtro%",
            nativeQuery = true
    )
    List<Producto> searchNativo(@Param("filtro") String filtro);

}
