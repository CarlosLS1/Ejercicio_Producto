package com.curso.model;

import java.util.Date;


public class Pedido {

	

	private int idPedidos;
	private int codigoProducto;
	private int unidades;
	private double total;
	private Date fechaPedido;
	
	public Pedido() {

	}
	
	public Pedido(int idPedidos, int codigoProducto, int unidades, double total, Date fechaPedido) {
		this.idPedidos = idPedidos;
		this.codigoProducto = codigoProducto;
		this.unidades = unidades;
		this.total = total;
		this.fechaPedido = fechaPedido;
	}
	public int getIdPedidos() {
		return idPedidos;
	}
	public void setIdPedidos(int idPedidos) {
		this.idPedidos = idPedidos;
	}
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	
	


}
