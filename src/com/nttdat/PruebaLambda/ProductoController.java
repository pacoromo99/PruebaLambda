package com.nttdat.PruebaLambda;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

public class ProductoController {

	static BigDecimal ivaCalculado = new BigDecimal(0);
	static BigDecimal total2 = new BigDecimal(0);
	
	public static void calcularPrecioTotal(List<Product> shoppingCart) 
	{
		shoppingCart.stream().forEach(pro -> {
			ivaCalculado = pro.getPrecio().multiply(pro.getTax().getPrecio());
			total2 = total2.add(pro.getPrecio().add(ivaCalculado));
		});
		System.out.println("----PrecioTotal----\n");
		System.out.println(total2);
	}

	public static void listaOrdenada(List<Product> shoppingCart) {
		System.out.println("\n-----Productos que comienzan por C ordenados por nombre-----\n");

		Stream<Product> productos = shoppingCart.stream().filter(producto -> producto.getNombre().startsWith("C"))
				.sorted();
		productos.forEach((p) -> {
			System.out.print(p.getNombre()+ ",");
		});
	}
}
