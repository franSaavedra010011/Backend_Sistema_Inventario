package com.example.inventario.services;

import com.example.inventario.entities.Salida;
import com.example.inventario.repositories.BaseRepository;
import com.example.inventario.repositories.SalidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalidaServiceImpl extends BaseServiceImpl<Salida, Long> implements SalidaService{

    @Autowired
    private SalidaRepository salidaRepository;

    public SalidaServiceImpl(BaseRepository<Salida, Long> baseRepository) {
        super(baseRepository);
    }
}
