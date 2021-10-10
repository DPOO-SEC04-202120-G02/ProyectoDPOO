package modelo;
import java.util.*;

public class Categoria {
	private String nombre;
	private static int numCategorias;
	private int idCategoria;
	private ArrayList<Producto> productos;
	
	public Categoria(String nombre) {
		this.nombre = nombre;
		idCategoria = numCategorias;
		numCategorias += 1;
		productos = new ArrayList<Producto>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCategoria() {
		return idCategoria;
	}
}
