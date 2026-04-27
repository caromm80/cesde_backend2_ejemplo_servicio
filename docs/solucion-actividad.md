# Solución Actividad: Gestión de Proveedores

## 1. Validación agregada en el servicio
Se validó que el número de teléfono tenga exactamente 10 dígitos numéricos.
Si no cumple, se lanza una excepción con el mensaje:
"El número de teléfono debe tener exactamente 10 dígitos".

## 2. Endpoint de búsqueda personalizada
Se implementó el método `findByNombreContainingIgnoreCase` en el repositorio,
el cual permite buscar proveedores por nombre sin importar mayúsculas o minúsculas.

Endpoint: GET /api/proveedores/buscar?nombre=...

## 3. Pruebas realizadas en Postman

- POST /api/proveedores → Se creó un proveedor con teléfono de 10 dígitos. Respuesta: 200 OK.
- GET /api/proveedores → Se listaron todos los proveedores. Respuesta: 200 OK.
- GET /api/proveedores/buscar?nombre=proveedor → Se encontró el proveedor creado. Respuesta: 200 OK.