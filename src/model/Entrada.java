package model;


public class Entrada {
	
	private String nombre;
	private Integer precio;
	private Integer asiento;
	private String cliente;
	private String vendedor;
	
	
	public Entrada() {
		super();
	}


	public Entrada(String nombre, Integer precio, Integer asiento, String cliente, String vendedor, boolean vip) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.asiento = asiento;
		this.cliente = cliente;
		this.vendedor = vendedor;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getPrecio() {
		return precio;
	}


	public void setPrecio(Integer precio) {
		this.precio = precio;
	}


	public Integer getAsiento() {
		return asiento;
	}


	public void setAsiento(Integer asiento) {
		this.asiento = asiento;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getVendedor() {
		return vendedor;
	}


	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}


	@Override
	public String toString() {
		return "Entrada [nombre=" + nombre + ", precio=" + precio + ", asiento=" + asiento + ", cliente=" + cliente
				+ ", vendedor=" + vendedor + "]";
	}
	
	
	
	
}
