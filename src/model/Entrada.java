package model;


public class Entrada {
	
	private String nombre;
	private Integer precio;
	private Integer asiento;
	private String cliente;
	private String vendedor;
	private boolean usada;
	
	
	public Entrada() {
		super();
	}


	public Entrada(String nombre, Integer precio, Integer asiento, String cliente, String vendedor, boolean usada) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.asiento = asiento;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.usada = usada;
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
	


	public boolean isUsada() {
		return usada;
	}


	public void setUsada(boolean usada) {
		this.usada = usada;
	}


	@Override
	public String toString() {
		return "Entrada [nombre=" + nombre + ", precio=" + precio + ", asiento=" + asiento + ", cliente=" + cliente
				+ ", vendedor=" + vendedor + "usada=" + usada +"]";
	}
	
	
	
	
}
