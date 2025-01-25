package com.example.inventario.controllers;

import com.example.inventario.entities.Sucursal;
import com.example.inventario.services.SucursalServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/sucursales")
public class SucursalController extends BaseControllerImpl<Sucursal, SucursalServiceImpl>{

}
