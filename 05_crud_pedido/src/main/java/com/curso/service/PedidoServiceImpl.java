package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Pedido;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	RestTemplate template;
	
	@Override
	public List<Pedido> listaPedidos() {
		return null;
	}

	@Override
	public Pedido buscarPedido(int codigoPedido) {
		return null;
	}

	@Override
	public void eliminarPedido(int codigoPedido) {
		

	}

	@Override
	public void crearPedido(Pedido pedido) {
		

	}

	@Override
	public void actualizarPedido(Pedido pedido) {
		

	}

}
