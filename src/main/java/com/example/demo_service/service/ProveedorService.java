package com.example.demo_service.service;

import com.example.demo_service.model.entity.Proveedor;
import com.example.demo_service.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepositorio;

    // Listar todos los proveedores
    public List<Proveedor> listar() {
        return proveedorRepositorio.findAll();
    }

    // Guardar proveedor con validación de teléfono
    public Proveedor guardarProveedor(Proveedor proveedor) {
        if (proveedor.getTelefono() == null || !proveedor.getTelefono().matches("\\d{10}")) {
            throw new IllegalArgumentException("El número de teléfono debe tener exactamente 10 dígitos");
        }
        return proveedorRepositorio.save(proveedor);
    }

    // Buscar por nombre ignorando mayúsculas
    public List<Proveedor> buscarPorNombre(String nombre) {
        return proveedorRepositorio.findByNombreContainingIgnoreCase(nombre);
    }
}