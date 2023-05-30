package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Producto;
import com.curso.service.ProductoServiceImpl;

@RestController
public class ProductoController {
	
	@Autowired
	ProductoServiceImpl service;

	@GetMapping(value="productos", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> listaProducto() {
		return service.listaProductos();
	}
	@GetMapping(value="producto/{idproducto}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Producto unProducto(@PathVariable("idProducto")int idProducto) {
		return service.buscarProducto(idProducto);
	}
	@PostMapping(value="producto", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void agregarProducto(@RequestBody Producto producto) {
		service.crearProducto(producto);
	}
	@PutMapping(value="producto", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizarPorducto(@RequestBody Producto producto) {
		service.actualizarProducto(producto);
	}
	@DeleteMapping(value="producto/{idproducto}", produces=MediaType.APPLICATION_JSON_VALUE)
	public void  eliminarProducto(@PathVariable("idProducto")int idProducto) {
		service.eliminarProducto(idProducto);
	}	
}
