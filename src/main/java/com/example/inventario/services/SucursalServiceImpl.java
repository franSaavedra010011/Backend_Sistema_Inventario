package com.example.inventario.services;

import com.example.inventario.entities.Sucursal;
import com.example.inventario.repositories.BaseRepository;
import com.example.inventario.repositories.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalServiceImpl extends BaseServiceImpl<Sucursal, Long> implements SucursalService{

    @Autowired
    private SucursalRepository sucursalRepository;

    public SucursalServiceImpl(BaseRepository<Sucursal, Long> baseRepository) {
        super(baseRepository);
    }
}
