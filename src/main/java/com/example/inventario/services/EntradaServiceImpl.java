package com.example.inventario.services;

import com.example.inventario.entities.Entrada;
import com.example.inventario.repositories.BaseRepository;
import com.example.inventario.repositories.EntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntradaServiceImpl extends BaseServiceImpl<Entrada, Long> implements EntradaService{

    @Autowired
    private EntradaRepository entradaRepository;

    public EntradaServiceImpl(BaseRepository<Entrada, Long> baseRepository) {
        super(baseRepository);
    }
}
