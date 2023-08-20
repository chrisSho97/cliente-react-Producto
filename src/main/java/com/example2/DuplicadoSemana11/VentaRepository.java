package com.example2.DuplicadoSemana11;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "ventas", path = "ventas")
public interface VentaRepository extends CrudRepository<Venta, Long> { 
}
