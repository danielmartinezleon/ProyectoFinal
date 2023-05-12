package com.salesianostriana.dam.proyectoortopedia.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String numero;
	private Date fechaVenta;
	private Date fechaRecepcion;
	private double total;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne(mappedBy = "venta")
	private LineaVenta linea;
	
	public Venta() {
		// TODO Auto-generated constructor stub
	}

	public Venta(int id, String numero, Date fechaVenta, Date fechaRecepcion, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaVenta = fechaVenta;
		this.fechaRecepcion = fechaRecepcion;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Date getFechaRecepcion() {
		return fechaRecepcion;
	}

	public void setFechaRecepcion(Date fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LineaVenta getLinea() {
		return linea;
	}

	public void setLinea(LineaVenta linea) {
		this.linea = linea;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", numero=" + numero + ", fechaVenta=" + fechaVenta + ", fechaRecepcion="
				+ fechaRecepcion + ", total=" + total + "]";
	}
	
	

}
