package modelo;

import java.util.*;

public class Compra {
	private static int numCompras;
	private int idCompra;
	private Cliente cliente;
	private ArrayList<Entrada> entradas;

	public Compra(Cliente cliente) {
		this.cliente = cliente;
		idCompra = numCompras;
		numCompras += 1;
		entradas = new ArrayList<Entrada>();
	}

	public int getIdCompra() {
		return idCompra;
	}
	
	public Cliente getCliente() { return cliente; }
	 
	public void agregarEntrada(Entrada entrada) {
		entradas.add(entrada);
	}

	public String toString() {
		String imprimible = "";
		for (Entrada entrada : entradas) {
			imprimible += entrada.toString();
			imprimible += "\n";
		}
		return imprimible;
	}

	public int getPrecio() {
		int precio;
		for (Entrada entrada : entradas) {
			precio += entrada.getPrecio();
		}
		return precio;
	}

}
