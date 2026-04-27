package com.example.demo_service.controller;

import com.example.demo_service.model.entity.Proveedor;
import com.example.demo_service.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    // GET /api/proveedores - Listar todos
    @GetMapping
    public List<Proveedor> listarProveedores() {
        return proveedorService.listar();
    }

    // POST /api/proveedores - Crear nuevo proveedor
    @PostMapping
    public Proveedor crearProveedor(@RequestBody Proveedor proveedor) {
        return proveedorService.guardarProveedor(proveedor);
    }

    // GET /api/proveedores/buscar?nombre=... - Buscar por nombre
    @GetMapping("/buscar")
    public List<Proveedor> buscarPorNombre(@RequestParam String nombre) {
        return proveedorService.buscarPorNombre(nombre);
    }
}