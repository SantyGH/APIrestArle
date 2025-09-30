package com.santiago.tienda.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public record Producto(
		@Id int id,
		String nombre,
		double precio,
		int stock,
		String categoria) {

}
