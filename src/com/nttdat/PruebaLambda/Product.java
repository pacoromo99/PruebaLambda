package com.nttdat.PruebaLambda;

import java.math.BigDecimal;

public class Product implements Comparable<Product> {
	Long id;
	String nombre;
	BigDecimal precio;
	Tax tax;

	public Product() {
	}

	public Product(Long id, String nombre, BigDecimal precio, Tax tax) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.tax = tax;
	}

	public Product(String nombre, BigDecimal precio, Tax tax) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.tax = tax;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public int compareTo(Product o) {
		int ordenado = this.nombre.compareTo(o.getNombre());
		return ordenado;
	}
}
