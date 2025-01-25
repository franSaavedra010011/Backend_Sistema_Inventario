package com.example.inventario.controllers;

import com.example.inventario.entities.Salida;
import com.example.inventario.services.SalidaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/salidas")
public class SalidaController extends BaseControllerImpl<Salida, SalidaServiceImpl>{

}
