package com.santiago.tienda.controller;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santiago.tienda.model.Producto;
import com.santiago.tienda.service.TiendaService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/producto")
public class TiendaController {
	private final TiendaService service;
	
	public TiendaController(TiendaService service) {
		this.service=service;
	}
	
	@PostMapping
	public Mono<Producto> create(@RequestBody Producto producto){
		return service.create(producto);
	}
	@GetMapping
	public Flux<Producto> getAll(){
		return service.getAll();
	}
	@GetMapping("/{id}")
	public Mono<Producto> getById(@PathVariable Integer id){
		return service.getById(id);
	}
	@DeleteMapping("/{id}")
	public Mono<Void> delete(@PathVariable Integer id){
		return service.delete(id);
	}
	@PutMapping("/{id}")
	public Mono<Producto> update(@PathVariable Integer id, @RequestBody Producto producto) {
		return service.update(id, producto);
	}

}
