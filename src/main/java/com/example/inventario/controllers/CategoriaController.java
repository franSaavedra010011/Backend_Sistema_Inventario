package com.example.inventario.controllers;

import com.example.inventario.entities.Categoria;
import com.example.inventario.services.CategoriaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*") //Permitir acceso a API desde cualquier origen (clientes)
@RequestMapping(path = "api/v1/categorias") //Es la ruta para acceder a los recursos
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaServiceImpl>{
    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }

    }
}


