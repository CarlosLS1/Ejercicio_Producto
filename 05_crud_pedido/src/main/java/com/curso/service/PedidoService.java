package com.curso.service;

import java.util.List;

import com.curso.model.Pedido;



public interface PedidoService {
	List<Pedido> listaPedidos();
	Pedido buscarPedido(int codigoPedido);
	void eliminarPedido(int codigoPedido);
	void crearPedido(Pedido pedido);
	void actualizarPedido(Pedido pedido);

}
