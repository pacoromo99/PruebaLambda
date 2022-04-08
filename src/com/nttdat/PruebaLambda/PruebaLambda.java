package com.nttdat.PruebaLambda;

import java.math.BigDecimal;
import java.util.List;

public class PruebaLambda {

	public static void main(String[] args) {

		List<Product> shoppingCart = List.of(new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

		// Precio total lista del carrito
		ProductoController.calcularPrecioTotal(shoppingCart);
		
		//Lista de productos por "C" ordenada por nombre
		ProductoController.listaOrdenada(shoppingCart);
	}
}
