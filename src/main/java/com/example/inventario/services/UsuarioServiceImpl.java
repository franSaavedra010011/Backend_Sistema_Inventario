package com.example.inventario.services;

import com.example.inventario.entities.Usuario;
import com.example.inventario.repositories.BaseRepository;
import com.example.inventario.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long> implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository) {
        super(baseRepository);
    }
}
