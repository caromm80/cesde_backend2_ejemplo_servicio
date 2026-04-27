package com.example.demo_service.repository;

import com.example.demo_service.model.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository



public interface ProveedorRepository extends JpaRepository<Proveedor, Long>  {

List<Proveedor> findByNombreContainingIgnoreCase(String nombre);


}
