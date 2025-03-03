package com.example.inventario.services;

import com.example.inventario.entities.Producto;

import java.util.List;

public interface ProductoService extends BaseService<Producto, Long>{
    List<Producto> search(String filtro) throws Exception;
}
