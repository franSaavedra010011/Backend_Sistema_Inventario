package com.example.inventario.services;

import com.example.inventario.entities.Categoria;
import com.example.inventario.repositories.BaseRepository;
import com.example.inventario.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria, Long> implements CategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Categoria> search(String filtro) throws Exception {
        try {
            List<Categoria> categorias = categoriaRepository.search(filtro);
            return categorias;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
