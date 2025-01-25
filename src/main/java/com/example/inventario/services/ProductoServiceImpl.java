package com.example.inventario.services;

import com.example.inventario.entities.Producto;
import com.example.inventario.repositories.BaseRepository;
import com.example.inventario.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto, Long> implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository) {
        super(baseRepository);
    }
}
