package com.santiago.tienda.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import org.springframework.stereotype.Repository;

import com.santiago.tienda.model.Producto;

@Repository
public interface TiendaRepository extends ReactiveCrudRepository<Producto, Integer> {

}
