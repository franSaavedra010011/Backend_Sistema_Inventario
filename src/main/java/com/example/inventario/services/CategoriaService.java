package com.example.inventario.services;

import com.example.inventario.entities.Categoria;

import java.util.List;

public interface CategoriaService extends BaseService<Categoria, Long>{
    List<Categoria> search(String filtro) throws Exception;

}
