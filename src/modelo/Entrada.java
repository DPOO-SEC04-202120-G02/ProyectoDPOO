package modelo;

public abstract class Entrada {
	
	private Producto producto;
	private int codigo;
	
	
	public Entrada(Producto producto) {
		this.producto = producto;
		codigo = producto.getCodigo();
	}
	
	public abstract Number getCantidad();
	
	public int getPrecio() {
		return (producto.getPrecio() * getCantidad());
	}
	
}
