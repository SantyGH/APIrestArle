package com.santiago.tienda.service;

import org.springframework.stereotype.Service;

import com.santiago.tienda.model.Producto;
import com.santiago.tienda.repository.TiendaRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TiendaService {
	private final TiendaRepository repository;
	
	public TiendaService(TiendaRepository repository) {
		this.repository=repository;
	}
	
	public Mono<Producto> create(Producto producto){
		return repository.save(producto);
	}
	public Mono<Producto> update(int id, Producto newData){
		return repository.findById(id)
				.flatMap(existing-> repository.save(new Producto(id, newData.nombre(), newData.precio(), newData.stock(), newData.categoria())));
	}
	public Mono<Producto> getById(int id){
		return repository.findById(id);
	}
	public Flux<Producto> getAll(){
		return repository.findAll();
	}
	public Mono<Void> delete(int id){
		return repository.deleteById(id);
	}
}
