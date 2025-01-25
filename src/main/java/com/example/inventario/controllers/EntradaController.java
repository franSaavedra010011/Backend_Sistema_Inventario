package com.example.inventario.controllers;

import com.example.inventario.entities.Entrada;
import com.example.inventario.services.EntradaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/entradas")
public class EntradaController extends BaseControllerImpl<Entrada, EntradaServiceImpl>{

}
